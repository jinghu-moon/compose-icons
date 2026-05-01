package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CrownCross: ImageVector
    get() {
        if (_crownCross != null) return _crownCross!!
        _crownCross = phosphorLightIcon(
            name = "CrownCross",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(180.0f, 58.0f),
                    PathNode.CurveTo(160.85f, 58.0f, 144.43f, 65.79f, 134.0f, 78.32f),
                    PathNode.LineTo(134.0f, 38.0f),
                    PathNode.LineTo(152.0f, 38.0f),
                    PathNode.CurveTo(155.3137f, 38.0f, 158.0f, 35.31371f, 158.0f, 32.0f),
                    PathNode.CurveTo(158.0f, 28.68629f, 155.3137f, 26.0f, 152.0f, 26.0f),
                    PathNode.LineTo(134.0f, 26.0f),
                    PathNode.LineTo(134.0f, 8.0f),
                    PathNode.CurveTo(134.0f, 4.686292f, 131.3137f, 2.0f, 128.0f, 2.0f),
                    PathNode.CurveTo(124.686295f, 2.0f, 122.0f, 4.686292f, 122.0f, 8.0f),
                    PathNode.LineTo(122.0f, 26.0f),
                    PathNode.LineTo(104.0f, 26.0f),
                    PathNode.CurveTo(100.686295f, 26.0f, 98.0f, 28.68629f, 98.0f, 32.0f),
                    PathNode.CurveTo(98.0f, 35.31371f, 100.686295f, 38.0f, 104.0f, 38.0f),
                    PathNode.LineTo(122.0f, 38.0f),
                    PathNode.LineTo(122.0f, 78.32f),
                    PathNode.CurveTo(111.57f, 65.79f, 95.15f, 58.0f, 76.0f, 58.0f),
                    PathNode.CurveTo(43.983475f, 58.03857f, 18.03857f, 83.983475f, 18.0f, 116.0f),
                    PathNode.CurveTo(18.0f, 145.11f, 32.17f, 163.62f, 44.05f, 174.0f),
                    PathNode.CurveTo(50.645042f, 179.73645f, 58.060253f, 184.45522f, 66.05f, 188.0f),
                    PathNode.LineTo(66.05f, 208.0f),
                    PathNode.CurveTo(66.05f, 215.73198f, 72.318016f, 222.0f, 80.05f, 222.0f),
                    PathNode.LineTo(176.05f, 222.0f),
                    PathNode.CurveTo(183.78198f, 222.0f, 190.05f, 215.73198f, 190.05f, 208.0f),
                    PathNode.LineTo(190.05f, 188.05f),
                    PathNode.CurveTo(198.0253f, 184.48547f, 205.42355f, 179.74992f, 212.0f, 174.0f),
                    PathNode.CurveTo(223.88f, 163.61f, 238.05f, 145.1f, 238.05f, 116.0f),
                    PathNode.CurveTo(238.01138f, 83.963974f, 212.03606f, 58.01101f, 180.0f, 58.0f),
                    PathNode.Close,
                    PathNode.MoveTo(182.1f, 178.31f),
                    PathNode.CurveTo(179.65172f, 179.12735f, 178.00052f, 181.41888f, 178.0f, 184.0f),
                    PathNode.LineTo(178.0f, 208.0f),
                    PathNode.CurveTo(178.0f, 209.10457f, 177.10457f, 210.0f, 176.0f, 210.0f),
                    PathNode.LineTo(80.0f, 210.0f),
                    PathNode.CurveTo(78.89543f, 210.0f, 78.0f, 209.10457f, 78.0f, 208.0f),
                    PathNode.LineTo(78.0f, 184.0f),
                    PathNode.CurveTo(77.99947f, 181.41888f, 76.34828f, 179.12735f, 73.9f, 178.31f),
                    PathNode.CurveTo(73.46f, 178.16f, 30.0f, 163.13f, 30.0f, 116.0f),
                    PathNode.CurveTo(30.033054f, 90.608604f, 50.608604f, 70.03306f, 76.0f, 70.0f),
                    PathNode.CurveTo(102.65f, 70.0f, 122.0f, 87.66f, 122.0f, 112.0f),
                    PathNode.LineTo(122.0f, 176.0f),
                    PathNode.CurveTo(122.0f, 179.3137f, 124.686295f, 182.0f, 128.0f, 182.0f),
                    PathNode.CurveTo(131.3137f, 182.0f, 134.0f, 179.3137f, 134.0f, 176.0f),
                    PathNode.LineTo(134.0f, 112.0f),
                    PathNode.CurveTo(134.0f, 87.66f, 153.35f, 70.0f, 180.0f, 70.0f),
                    PathNode.CurveTo(205.39139f, 70.03306f, 225.96695f, 90.608604f, 226.0f, 116.0f),
                    PathNode.CurveTo(226.0f, 162.9f, 183.88f, 177.71f, 182.1f, 178.31f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _crownCross!!
    }

private var _crownCross: ImageVector? = null
