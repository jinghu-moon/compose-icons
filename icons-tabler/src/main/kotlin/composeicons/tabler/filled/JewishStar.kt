package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.JewishStar: ImageVector
    get() {
        if (_jewishStar != null) return _jewishStar!!
        _jewishStar = tablerFilledIcon(
            name = "JewishStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.433f, 6.0f),
                    PathNode.LineTo(3.0f, 6.0f),
                    PathNode.LineTo(2.886f, 6.006f),
                    PathNode.CurveTo(2.54838f, 6.044896f, 2.253624f, 6.2526f, 2.103419f, 6.557458f),
                    PathNode.CurveTo(1.953214f, 6.862316f, 1.968122f, 7.222594f, 2.143f, 7.514f),
                    PathNode.LineTo(4.833f, 12.0f),
                    PathNode.LineTo(2.143f, 16.486f),
                    PathNode.LineTo(2.089f, 16.586f),
                    PathNode.CurveTo(1.948171f, 16.895645f, 1.974407f, 17.255644f, 2.15864f, 17.5416f),
                    PathNode.CurveTo(2.342873f, 17.827555f, 2.659835f, 18.000246f, 3.0f, 18.0f),
                    PathNode.LineTo(8.434f, 18.0f),
                    PathNode.LineTo(11.143f, 22.514f),
                    PathNode.LineTo(11.217f, 22.622f),
                    PathNode.CurveTo(11.421135f, 22.87859f, 11.738091f, 23.018806f, 12.065269f, 22.99726f),
                    PathNode.CurveTo(12.392447f, 22.975714f, 12.688276f, 22.795147f, 12.857f, 22.514f),
                    PathNode.LineTo(15.565f, 18.0f),
                    PathNode.LineTo(21.0f, 18.0f),
                    PathNode.LineTo(21.114f, 17.994f),
                    PathNode.CurveTo(21.45162f, 17.955105f, 21.746376f, 17.7474f, 21.896582f, 17.442541f),
                    PathNode.CurveTo(22.046787f, 17.137684f, 22.031878f, 16.777407f, 21.857f, 16.486f),
                    PathNode.LineTo(19.166f, 12.0f),
                    PathNode.LineTo(21.857f, 7.514f),
                    PathNode.LineTo(21.911f, 7.414f),
                    PathNode.CurveTo(22.051828f, 7.104356f, 22.025593f, 6.744357f, 21.84136f, 6.458401f),
                    PathNode.CurveTo(21.657127f, 6.172446f, 21.340166f, 5.999754f, 21.0f, 6.0f),
                    PathNode.LineTo(15.566f, 6.0f),
                    PathNode.LineTo(12.857f, 1.486f),
                    PathNode.CurveTo(12.676165f, 1.18526f, 12.350922f, 1.001316f, 12.0f, 1.001316f),
                    PathNode.CurveTo(11.649078f, 1.001316f, 11.323835f, 1.18526f, 11.143f, 1.486f),
                    PathNode.LineTo(8.433f, 6.0f),
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
        return _jewishStar!!
    }

private var _jewishStar: ImageVector? = null
