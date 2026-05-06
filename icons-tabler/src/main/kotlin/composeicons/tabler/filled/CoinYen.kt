package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CoinYen: ImageVector
    get() {
        if (_coinYen != null) return _coinYen!!
        _coinYen = tablerFilledIcon(
            name = "CoinYen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 3.34c4.203 2.426 6.057 7.52 4.397 12.081-1.66 4.56-6.354 7.271-11.134 6.428C5.484 21.006 2 16.853 2 12l.005-.324C2.119 8.163 4.069 4.968 7.141 3.26 10.213 1.552 13.956 1.582 17 3.34ZM15.555 7.168c-.221-.147-.491-.201-.751-.149-.26 .052-.489 .205-.636 .426L12 10.696 9.832 7.446C9.551 7.024 8.998 6.879 8.546 7.109l-.1 .059c-.221 .147-.374 .376-.426 .636-.052 .26 .001 .53 .148 .751L9.798 11h-.798c-.507 0-.934 .38-.993 .883L8 12c0 .552 .448 1 1 1h2v1h-2c-.507 0-.934 .38-.993 .883L8 15c0 .552 .448 1 1 1h2v1c0 .507 .38 .934 .883 .993L12 18l.117-.007c.503-.059 .883-.486 .883-.993v-1h2c.507-0 .934-.38 .993-.883L16 15c0-.552-.448-1-1-1h-2v-1h2c.507-0 .934-.38 .993-.883L16 12c0-.552-.448-1-1-1h-.799L15.832 8.555c.282-.422 .203-.988-.184-1.317l-.093-.07Z"),
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
        return _coinYen!!
    }

private var _coinYen: ImageVector? = null
