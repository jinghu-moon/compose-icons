package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HouseLine: ImageVector
    get() {
        if (_houseLine != null) return _houseLine!!
        _houseLine = phosphorThinIcon(
            name = "HouseLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 212.0f),
                    PathNode.LineTo(220.0f, 212.0f),
                    PathNode.LineTo(220.0f, 126.34f),
                    PathNode.LineTo(229.17f, 135.51f),
                    PathNode.CurveTo(230.73297f, 137.07297f, 233.26703f, 137.07297f, 234.83f, 135.51f),
                    PathNode.CurveTo(236.39296f, 133.94704f, 236.39296f, 131.41296f, 234.83f, 129.85f),
                    PathNode.LineTo(136.49f, 31.51f),
                    PathNode.CurveTo(134.23837f, 29.250546f, 131.17982f, 27.980537f, 127.99f, 27.980537f),
                    PathNode.CurveTo(124.80018f, 27.980537f, 121.74162f, 29.250546f, 119.49f, 31.51f),
                    PathNode.LineTo(21.17f, 129.85f),
                    PathNode.CurveTo(19.607035f, 131.41296f, 19.607035f, 133.94704f, 21.17f, 135.51f),
                    PathNode.CurveTo(22.732965f, 137.07297f, 25.267035f, 137.07297f, 26.83f, 135.51f),
                    PathNode.LineTo(36.0f, 126.34f),
                    PathNode.LineTo(36.0f, 212.0f),
                    PathNode.LineTo(16.0f, 212.0f),
                    PathNode.CurveTo(13.790861f, 212.0f, 12.0f, 213.79086f, 12.0f, 216.0f),
                    PathNode.CurveTo(12.0f, 218.20914f, 13.790861f, 220.0f, 16.0f, 220.0f),
                    PathNode.LineTo(240.0f, 220.0f),
                    PathNode.CurveTo(242.20914f, 220.0f, 244.0f, 218.20914f, 244.0f, 216.0f),
                    PathNode.CurveTo(244.0f, 213.79086f, 242.20914f, 212.0f, 240.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 118.34f),
                    PathNode.LineTo(125.17f, 37.17f),
                    PathNode.CurveTo(125.92027f, 36.41889f, 126.93836f, 35.996853f, 128.0f, 35.996853f),
                    PathNode.CurveTo(129.06163f, 35.996853f, 130.07973f, 36.41889f, 130.83f, 37.17f),
                    PathNode.LineTo(212.0f, 118.34f),
                    PathNode.LineTo(212.0f, 212.0f),
                    PathNode.LineTo(156.0f, 212.0f),
                    PathNode.LineTo(156.0f, 152.0f),
                    PathNode.CurveTo(156.0f, 149.79086f, 154.20914f, 148.0f, 152.0f, 148.0f),
                    PathNode.LineTo(104.0f, 148.0f),
                    PathNode.CurveTo(101.79086f, 148.0f, 100.0f, 149.79086f, 100.0f, 152.0f),
                    PathNode.LineTo(100.0f, 212.0f),
                    PathNode.LineTo(44.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(148.0f, 212.0f),
                    PathNode.LineTo(108.0f, 212.0f),
                    PathNode.LineTo(108.0f, 156.0f),
                    PathNode.LineTo(148.0f, 156.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _houseLine!!
    }

private var _houseLine: ImageVector? = null
