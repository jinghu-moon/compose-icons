package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BabyCarriage: ImageVector
    get() {
        if (_babyCarriage != null) return _babyCarriage!!
        _babyCarriage = phosphorFillIcon(
            name = "BabyCarriage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(215.58f, 54.55f),
                    PathNode.CurveTo(215.19333f, 54.074528f, 214.75005f, 53.64804f, 214.26f, 53.28f),
                    PathNode.CurveTo(199.50974f, 39.588894f, 180.12503f, 31.986486f, 160.0f, 32.0f),
                    PathNode.LineTo(152.0f, 32.0f),
                    PathNode.CurveTo(143.16344f, 32.0f, 136.0f, 39.163445f, 136.0f, 48.0f),
                    PathNode.LineTo(136.0f, 104.0f),
                    PathNode.LineTo(55.2f, 104.0f),
                    PathNode.CurveTo(51.37324f, 85.388245f, 35.001083f, 72.02322f, 16.0f, 72.0f),
                    PathNode.CurveTo(11.581722f, 72.0f, 8.0f, 75.58172f, 8.0f, 80.0f),
                    PathNode.CurveTo(8.0f, 84.41828f, 11.581722f, 88.0f, 16.0f, 88.0f),
                    PathNode.CurveTo(29.254833f, 88.0f, 40.0f, 98.74516f, 40.0f, 112.0f),
                    PathNode.CurveTo(40.0496f, 156.16223f, 75.83778f, 191.9504f, 120.0f, 192.0f),
                    PathNode.LineTo(160.0f, 192.0f),
                    PathNode.CurveTo(192.59845f, 192.02252f, 221.94514f, 172.24887f, 234.16557f, 142.02766f),
                    PathNode.CurveTo(246.38597f, 111.806465f, 239.03181f, 77.19225f, 215.58f, 54.55f),
                    PathNode.Close,
                    PathNode.MoveTo(208.67f, 70.55f),
                    PathNode.CurveTo(216.76949f, 80.01311f, 221.9183f, 91.64229f, 223.48f, 104.0f),
                    PathNode.LineTo(166.81f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 48.0f),
                    PathNode.CurveTo(173.13557f, 47.987644f, 185.95267f, 52.04342f, 196.69f, 59.61f),
                    PathNode.LineTo(152.0f, 95.35f),
                    PathNode.LineTo(152.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 224.0f),
                    PathNode.CurveTo(104.0f, 232.83656f, 96.836555f, 240.0f, 88.0f, 240.0f),
                    PathNode.CurveTo(79.163445f, 240.0f, 72.0f, 232.83656f, 72.0f, 224.0f),
                    PathNode.CurveTo(72.0f, 215.16344f, 79.163445f, 208.0f, 88.0f, 208.0f),
                    PathNode.CurveTo(96.836555f, 208.0f, 104.0f, 215.16344f, 104.0f, 224.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 224.0f),
                    PathNode.CurveTo(208.0f, 232.83656f, 200.83656f, 240.0f, 192.0f, 240.0f),
                    PathNode.CurveTo(183.16344f, 240.0f, 176.0f, 232.83656f, 176.0f, 224.0f),
                    PathNode.CurveTo(176.0f, 215.16344f, 183.16344f, 208.0f, 192.0f, 208.0f),
                    PathNode.CurveTo(200.83656f, 208.0f, 208.0f, 215.16344f, 208.0f, 224.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _babyCarriage!!
    }

private var _babyCarriage: ImageVector? = null
