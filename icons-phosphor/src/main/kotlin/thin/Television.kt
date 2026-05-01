package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Television: ImageVector
    get() {
        if (_television != null) return _television!!
        _television = phosphorThinIcon(
            name = "Television",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 68.0f),
                    PathNode.LineTo(137.66f, 68.0f),
                    PathNode.LineTo(178.83f, 26.83f),
                    PathNode.CurveTo(180.39296f, 25.267035f, 180.39296f, 22.732965f, 178.83f, 21.17f),
                    PathNode.CurveTo(177.26703f, 19.607035f, 174.73297f, 19.607035f, 173.17f, 21.17f),
                    PathNode.LineTo(128.0f, 66.34f),
                    PathNode.LineTo(82.83f, 21.17f),
                    PathNode.CurveTo(81.26704f, 19.607035f, 78.73296f, 19.607035f, 77.17f, 21.17f),
                    PathNode.CurveTo(75.60703f, 22.732965f, 75.60703f, 25.267035f, 77.17f, 26.83f),
                    PathNode.LineTo(118.34f, 68.0f),
                    PathNode.LineTo(40.0f, 68.0f),
                    PathNode.CurveTo(33.37258f, 68.0f, 28.0f, 73.37258f, 28.0f, 80.0f),
                    PathNode.LineTo(28.0f, 200.0f),
                    PathNode.CurveTo(28.0f, 206.62741f, 33.37258f, 212.0f, 40.0f, 212.0f),
                    PathNode.LineTo(216.0f, 212.0f),
                    PathNode.CurveTo(222.62741f, 212.0f, 228.0f, 206.62741f, 228.0f, 200.0f),
                    PathNode.LineTo(228.0f, 80.0f),
                    PathNode.CurveTo(228.0f, 73.37258f, 222.62741f, 68.0f, 216.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 200.0f),
                    PathNode.LineTo(36.0f, 80.0f),
                    PathNode.CurveTo(36.0f, 77.79086f, 37.79086f, 76.0f, 40.0f, 76.0f),
                    PathNode.LineTo(148.0f, 76.0f),
                    PathNode.LineTo(148.0f, 204.0f),
                    PathNode.LineTo(40.0f, 204.0f),
                    PathNode.CurveTo(37.79086f, 204.0f, 36.0f, 202.20914f, 36.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 200.0f),
                    PathNode.CurveTo(220.0f, 202.20914f, 218.20914f, 204.0f, 216.0f, 204.0f),
                    PathNode.LineTo(156.0f, 204.0f),
                    PathNode.LineTo(156.0f, 76.0f),
                    PathNode.LineTo(216.0f, 76.0f),
                    PathNode.CurveTo(218.20914f, 76.0f, 220.0f, 77.79086f, 220.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 116.0f),
                    PathNode.CurveTo(196.0f, 120.41828f, 192.41827f, 124.0f, 188.0f, 124.0f),
                    PathNode.CurveTo(183.58173f, 124.0f, 180.0f, 120.41828f, 180.0f, 116.0f),
                    PathNode.CurveTo(180.0f, 111.58172f, 183.58173f, 108.0f, 188.0f, 108.0f),
                    PathNode.CurveTo(192.41827f, 108.0f, 196.0f, 111.58172f, 196.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 164.0f),
                    PathNode.CurveTo(196.0f, 168.41827f, 192.41827f, 172.0f, 188.0f, 172.0f),
                    PathNode.CurveTo(183.58173f, 172.0f, 180.0f, 168.41827f, 180.0f, 164.0f),
                    PathNode.CurveTo(180.0f, 159.58173f, 183.58173f, 156.0f, 188.0f, 156.0f),
                    PathNode.CurveTo(192.41827f, 156.0f, 196.0f, 159.58173f, 196.0f, 164.0f),
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
        return _television!!
    }

private var _television: ImageVector? = null
