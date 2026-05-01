package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GooglePlayLogo: ImageVector
    get() {
        if (_googlePlayLogo != null) return _googlePlayLogo!!
        _googlePlayLogo = phosphorBoldIcon(
            name = "GooglePlayLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(241.79f, 110.7f),
                    PathNode.LineTo(74.0f, 14.65f),
                    PathNode.CurveTo(67.75765f, 11.099044f, 60.101063f, 11.121876f, 53.88f, 14.71f),
                    PathNode.CurveTo(47.73951f, 18.221489f, 43.96459f, 24.766464f, 44.0f, 31.84f),
                    PathNode.LineTo(44.0f, 224.16f),
                    PathNode.CurveTo(43.97072f, 231.23978f, 47.75795f, 237.78622f, 53.91f, 241.29f),
                    PathNode.CurveTo(60.129967f, 244.88219f, 67.78872f, 244.90503f, 74.03f, 241.35f),
                    PathNode.LineTo(241.79f, 145.35f),
                    PathNode.CurveTo(248.09004f, 141.8729f, 252.00183f, 135.2459f, 252.00183f, 128.05f),
                    PathNode.CurveTo(252.00183f, 120.85411f, 248.09004f, 114.227104f, 241.79f, 110.75f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 203.0f),
                    PathNode.LineTo(68.0f, 53.0f),
                    PathNode.LineTo(143.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 145.0f),
                    PathNode.LineTo(172.4f, 157.4f),
                    PathNode.LineTo(114.4f, 190.6f),
                    PathNode.Close,
                    PathNode.MoveTo(114.41f, 65.43f),
                    PathNode.LineTo(172.41f, 98.63f),
                    PathNode.LineTo(160.0f, 111.0f),
                    PathNode.Close,
                    PathNode.MoveTo(194.0f, 145.0f),
                    PathNode.LineTo(177.0f, 128.0f),
                    PathNode.LineTo(194.0f, 111.0f),
                    PathNode.LineTo(223.72f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _googlePlayLogo!!
    }

private var _googlePlayLogo: ImageVector? = null
