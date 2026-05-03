package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ClockClockwise: ImageVector
    get() {
        if (_clockClockwise != null) return _clockClockwise!!
        _clockClockwise = phosphorLightIcon(
            name = "ClockClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(134.0f, 80.0f),
                    PathNode.LineTo(134.0f, 124.6f),
                    PathNode.LineTo(171.09f, 146.85f),
                    PathNode.CurveTo(173.93427f, 148.55656f, 174.85657f, 152.24573f, 173.15f, 155.09f),
                    PathNode.CurveTo(171.44344f, 157.93427f, 167.75427f, 158.85657f, 164.91f, 157.15f),
                    PathNode.LineTo(124.91f, 133.15f),
                    PathNode.CurveTo(123.10239f, 132.06398f, 121.99759f, 130.10876f, 122.0f, 128.0f),
                    PathNode.LineTo(122.0f, 80.0f),
                    PathNode.CurveTo(122.0f, 76.686295f, 124.686295f, 74.0f, 128.0f, 74.0f),
                    PathNode.CurveTo(131.3137f, 74.0f, 134.0f, 76.686295f, 134.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 58.0f),
                    PathNode.CurveTo(220.6863f, 58.0f, 218.0f, 60.68629f, 218.0f, 64.0f),
                    PathNode.LineTo(218.0f, 87.36f),
                    PathNode.CurveTo(210.52f, 78.53f, 203.06f, 70.23f, 194.47f, 61.53f),
                    PathNode.CurveTo(158.0108f, 25.070528f, 98.986855f, 24.785852f, 62.177666f, 60.89195f),
                    PathNode.CurveTo(25.368477f, 96.99805f, 24.514914f, 156.0165f, 60.264545f, 193.17198f),
                    PathNode.CurveTo(96.01418f, 230.32747f, 155.02167f, 231.74985f, 192.52f, 196.36f),
                    PathNode.CurveTo(194.84488f, 194.06842f, 194.91109f, 190.33862f, 192.66904f, 187.96596f),
                    PathNode.CurveTo(190.42697f, 185.59329f, 186.6994f, 185.44844f, 184.28f, 187.64f),
                    PathNode.CurveTo(151.56076f, 218.49745f, 100.09238f, 217.24187f, 68.91672f, 184.82568f),
                    PathNode.CurveTo(37.741055f, 152.4095f, 38.493713f, 100.931305f, 70.60375f, 69.44041f),
                    PathNode.CurveTo(102.71379f, 37.949516f, 154.19688f, 38.199173f, 186.0f, 70.0f),
                    PathNode.CurveTo(195.24f, 79.36f, 203.18f, 88.3f, 211.31f, 98.0f),
                    PathNode.LineTo(184.0f, 98.0f),
                    PathNode.CurveTo(180.6863f, 98.0f, 178.0f, 100.686295f, 178.0f, 104.0f),
                    PathNode.CurveTo(178.0f, 107.313705f, 180.6863f, 110.0f, 184.0f, 110.0f),
                    PathNode.LineTo(224.0f, 110.0f),
                    PathNode.CurveTo(227.3137f, 110.0f, 230.0f, 107.313705f, 230.0f, 104.0f),
                    PathNode.LineTo(230.0f, 64.0f),
                    PathNode.CurveTo(230.0f, 60.68629f, 227.3137f, 58.0f, 224.0f, 58.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _clockClockwise!!
    }

private var _clockClockwise: ImageVector? = null
