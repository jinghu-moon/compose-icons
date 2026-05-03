package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GooglePlayLogo: ImageVector
    get() {
        if (_googlePlayLogo != null) return _googlePlayLogo!!
        _googlePlayLogo = phosphorThinIcon(
            name = "GooglePlayLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(237.89f, 117.69f),
                    PathNode.LineTo(70.05f, 21.62f),
                    PathNode.CurveTo(66.30429f, 19.426006f, 61.665707f, 19.426006f, 57.92f, 21.62f),
                    PathNode.CurveTo(54.234886f, 23.711292f, 51.969894f, 27.632942f, 52.0f, 31.87f),
                    PathNode.LineTo(52.0f, 224.13f),
                    PathNode.CurveTo(51.9844f, 228.35278f, 54.247417f, 232.25572f, 57.92f, 234.34f),
                    PathNode.CurveTo(61.665707f, 236.534f, 66.30429f, 236.534f, 70.05f, 234.34f),
                    PathNode.LineTo(237.82f, 138.34f),
                    PathNode.CurveTo(241.61113f, 136.29396f, 243.9801f, 132.33878f, 243.99469f, 128.0308f),
                    PathNode.CurveTo(244.0093f, 123.722824f, 241.66718f, 119.75167f, 237.89f, 117.68f),
                    PathNode.Close,
                    PathNode.MoveTo(185.45f, 96.89f),
                    PathNode.LineTo(160.0f, 122.34f),
                    PathNode.LineTo(66.4f, 28.75f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 222.33f),
                    PathNode.LineTo(60.0f, 33.67f),
                    PathNode.LineTo(154.34f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(66.4f, 227.25f),
                    PathNode.LineTo(160.0f, 133.66f),
                    PathNode.LineTo(185.45f, 159.11f),
                    PathNode.Close,
                    PathNode.MoveTo(233.91f, 131.37f),
                    PathNode.LineTo(192.65f, 155.0f),
                    PathNode.LineTo(165.65f, 128.0f),
                    PathNode.LineTo(192.65f, 101.0f),
                    PathNode.LineTo(234.0f, 124.66f),
                    PathNode.CurveTo(235.25212f, 125.31818f, 236.03044f, 126.621895f, 236.01569f, 128.03639f),
                    PathNode.CurveTo(236.00093f, 129.45088f, 235.19559f, 130.7381f, 233.93f, 131.37f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _googlePlayLogo!!
    }

private var _googlePlayLogo: ImageVector? = null
