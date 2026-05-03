package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Flame: ImageVector
    get() {
        if (_flame != null) return _flame!!
        _flame = phosphorDuotoneIcon(
            name = "Flame",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 144.0f),
                    PathNode.CurveTo(208.01439f, 187.39064f, 173.43628f, 222.88269f, 130.06f, 224.0f),
                    PathNode.CurveTo(151.34303f, 222.90248f, 168.02827f, 205.3113f, 168.0f, 184.0f),
                    PathNode.CurveTo(168.0f, 144.0f, 128.0f, 120.0f, 128.0f, 120.0f),
                    PathNode.CurveTo(128.0f, 120.0f, 88.0f, 144.0f, 88.0f, 184.0f),
                    PathNode.CurveTo(87.97172f, 205.3113f, 104.65697f, 222.90248f, 125.94f, 224.0f),
                    PathNode.CurveTo(82.56374f, 222.88269f, 47.98561f, 187.39064f, 48.0f, 144.0f),
                    PathNode.CurveTo(48.0f, 72.0f, 128.0f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(128.0f, 24.0f, 208.0f, 72.0f, 208.0f, 144.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(173.79f, 51.48f),
                    PathNode.CurveTo(161.35413f, 38.374966f, 147.35994f, 26.842436f, 132.12f, 17.14f),
                    PathNode.CurveTo(129.58453f, 15.616695f, 126.41546f, 15.616695f, 123.88f, 17.14f),
                    PathNode.CurveTo(108.640076f, 26.842436f, 94.645874f, 38.374966f, 82.21f, 51.48f),
                    PathNode.CurveTo(54.59f, 80.48f, 40.0f, 112.47f, 40.0f, 144.0f),
                    PathNode.CurveTo(40.0f, 192.60106f, 79.39894f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(176.60106f, 232.0f, 216.0f, 192.60106f, 216.0f, 144.0f),
                    PathNode.CurveTo(216.0f, 112.47f, 201.41f, 80.48f, 173.79f, 51.48f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 184.0f),
                    PathNode.CurveTo(96.0f, 156.33f, 118.53f, 136.72f, 128.0f, 129.7f),
                    PathNode.CurveTo(137.48f, 136.7f, 160.0f, 156.33f, 160.0f, 184.0f),
                    PathNode.CurveTo(160.0f, 201.67311f, 145.67311f, 216.0f, 128.0f, 216.0f),
                    PathNode.CurveTo(110.32689f, 216.0f, 96.0f, 201.67311f, 96.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(173.27f, 199.93f),
                    PathNode.CurveTo(175.07762f, 194.81346f, 176.00081f, 189.42647f, 176.0f, 184.0f),
                    PathNode.CurveTo(176.0f, 140.0f, 133.91f, 114.21f, 132.12f, 113.14f),
                    PathNode.CurveTo(129.58453f, 111.61669f, 126.41546f, 111.61669f, 123.88f, 113.14f),
                    PathNode.CurveTo(122.09f, 114.21f, 80.0f, 140.0f, 80.0f, 184.0f),
                    PathNode.CurveTo(79.99918f, 189.42647f, 80.92238f, 194.81346f, 82.73f, 199.93f),
                    PathNode.CurveTo(65.82577f, 186.28401f, 56.000126f, 165.72478f, 56.0f, 144.0f),
                    PathNode.CurveTo(56.0f, 109.59f, 76.4f, 80.85f, 93.52f, 62.81f),
                    PathNode.CurveTo(103.958435f, 51.87473f, 115.514984f, 42.0644f, 128.0f, 33.54f),
                    PathNode.CurveTo(140.487f, 42.06182f, 152.0438f, 51.872368f, 162.48f, 62.81f),
                    PathNode.CurveTo(193.49f, 95.5f, 200.0f, 125.0f, 200.0f, 144.0f),
                    PathNode.CurveTo(199.99988f, 165.72478f, 190.17424f, 186.28401f, 173.27f, 199.93f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _flame!!
    }

private var _flame: ImageVector? = null
