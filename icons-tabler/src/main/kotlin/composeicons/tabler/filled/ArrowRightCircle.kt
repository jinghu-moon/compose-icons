package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowRightCircle: ImageVector
    get() {
        if (_arrowRightCircle != null) return _arrowRightCircle!!
        _arrowRightCircle = tablerFilledIcon(
            name = "ArrowRightCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5 15C3.343 15 2 13.657 2 12l.005-.176C2.087 10.397 3.164 9.226 4.58 9.025 5.995 8.825 7.355 9.651 7.83 11h10.756L17.294 9.707c-.356-.356-.392-.922-.083-1.32l.083-.094c.39-.39 1.024-.39 1.414 0l3 3 .097 .112 .071 .11 .031 .062 .034 .081 .024 .076 .03 .148L22 12l-.004 .085-.016 .116-.03 .111-.044 .111-.052 .098-.074 .104-.073 .082-3 3c-.392 .379-1.016 .374-1.402-.012-.386-.386-.391-1.009-.012-1.402L18.585 13h-10.756C7.405 14.199 6.272 15 5 15"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _arrowRightCircle!!
    }

private var _arrowRightCircle: ImageVector? = null
