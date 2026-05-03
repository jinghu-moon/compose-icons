package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Knife: ImageVector
    get() {
        if (_knife != null) return _knife!!
        _knife = phosphorFillIcon(
            name = "Knife",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.0f, 49.0f),
                    PathNode.CurveTo(235.97372f, 38.91256f, 229.88759f, 29.829233f, 220.56813f, 25.968536f),
                    PathNode.CurveTo(211.24867f, 22.107838f, 200.52206f, 24.226278f, 193.37f, 31.34f),
                    PathNode.LineTo(143.16f, 81.54f),
                    PathNode.LineTo(18.34f, 206.4f),
                    PathNode.CurveTo(16.284666f, 208.45679f, 15.507147f, 211.46681f, 16.309248f, 214.2617f),
                    PathNode.CurveTo(17.111347f, 217.05658f, 19.366756f, 219.19618f, 22.2f, 219.85f),
                    PathNode.CurveTo(34.070263f, 222.60153f, 46.215008f, 223.99382f, 58.4f, 224.0f),
                    PathNode.CurveTo(91.35f, 224.0f, 124.31f, 213.8f, 155.34f, 193.77f),
                    PathNode.CurveTo(187.1f, 173.27f, 205.53f, 149.95f, 206.34f, 148.97f),
                    PathNode.CurveTo(208.83464f, 145.78584f, 208.55994f, 141.24055f, 205.7f, 138.38f),
                    PathNode.LineTo(181.31f, 114.0f),
                    PathNode.LineTo(228.69f, 66.61f),
                    PathNode.CurveTo(233.37222f, 61.946133f, 236.00293f, 55.6087f, 236.0f, 49.0f),
                    PathNode.Close,
                    PathNode.MoveTo(146.23f, 180.6f),
                    PathNode.CurveTo(111.8f, 202.7f, 76.29f, 211.52f, 40.47f, 206.9f),
                    PathNode.LineTo(146.0f, 101.34f),
                    PathNode.LineTo(189.09f, 144.44f),
                    PathNode.CurveTo(176.40356f, 158.2715f, 162.00003f, 170.42345f, 146.23f, 180.6f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _knife!!
    }

private var _knife: ImageVector? = null
