package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.BracketsRound: ImageVector
    get() {
        if (_bracketsRound != null) return _bracketsRound!!
        _bracketsRound = phosphorRegularIcon(
            name = "BracketsRound",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(40.0f, 128.0f),
                    PathNode.CurveTo(40.0f, 186.29f, 74.67f, 208.25f, 76.15f, 209.16f),
                    PathNode.CurveTo(79.93315f, 211.4437f, 81.1487f, 216.36185f, 78.865f, 220.145f),
                    PathNode.CurveTo(76.5813f, 223.92815f, 71.66315f, 225.14369f, 67.88f, 222.86f),
                    PathNode.CurveTo(66.09f, 221.78f, 24.0f, 195.75f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 60.25f, 66.09f, 34.22f, 67.88f, 33.14f),
                    PathNode.CurveTo(71.655655f, 30.954973f, 76.48577f, 32.197598f, 78.73819f, 35.93344f),
                    PathNode.CurveTo(80.9906f, 39.66929f, 79.83483f, 44.520924f, 76.14f, 46.84f),
                    PathNode.CurveTo(74.54f, 47.83f, 40.0f, 69.82f, 40.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.12f, 33.14f),
                    PathNode.CurveTo(184.33685f, 30.856302f, 179.4187f, 32.07185f, 177.135f, 35.855f),
                    PathNode.CurveTo(174.8513f, 39.63815f, 176.06685f, 44.5563f, 179.85f, 46.84f),
                    PathNode.CurveTo(181.33f, 47.75f, 216.0f, 69.71f, 216.0f, 128.0f),
                    PathNode.CurveTo(216.0f, 186.29f, 181.33f, 208.25f, 179.88f, 209.14f),
                    PathNode.CurveTo(176.09132f, 211.41542f, 174.8646f, 216.33133f, 177.14f, 220.12f),
                    PathNode.CurveTo(179.41542f, 223.90868f, 184.33133f, 225.1354f, 188.12f, 222.86f),
                    PathNode.CurveTo(189.91f, 221.78f, 232.0f, 195.75f, 232.0f, 128.0f),
                    PathNode.CurveTo(232.0f, 60.25f, 189.91f, 34.22f, 188.12f, 33.14f),
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
        return _bracketsRound!!
    }

private var _bracketsRound: ImageVector? = null
