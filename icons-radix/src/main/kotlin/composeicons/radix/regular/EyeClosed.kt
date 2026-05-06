package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.EyeClosed: ImageVector
    get() {
        if (_eyeClosed != null) return _eyeClosed!!
        _eyeClosed = radixIcon(
            name = "EyeClosed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.583 12.587c-.072 .266-.346 .425-.612 .353-.266-.072-.426-.346-.354-.612l.967 .259ZM10.383 12.328c.071 .267-.087 .541-.353 .612-.266 .071-.541-.087-.612-.353l.966-.259ZM14.137 6.155c.16-.169 .422-.207 .627-.079 .205 .128 .285 .38 .204 .598l-.045 .091c-.439 .703-.962 1.341-1.555 1.897l1.202 1.202 .064 .078c.128 .194 .106 .458-.064 .629-.171 .171-.435 .193-.629 .064l-.078-.064L12.599 9.306c-.796 .595-1.692 1.054-2.667 1.343l.45 1.679-.483 .129-.482 .13L8.958 10.878c-.471 .08-.958 .122-1.458 .122-.501 0-.988-.043-1.46-.124l-.457 1.711-.483-.13-.483-.129 .449-1.679C4.09 10.36 3.194 9.902 2.398 9.307L1.136 10.571c-.195 .195-.512 .195-.707 0-.195-.195-.195-.512 0-.707L1.63 8.662C1.104 8.168 .633 7.61 .227 7L.076 6.764 .031 6.674C-.05 6.456 .03 6.204 .235 6.076c.205-.128 .467-.09 .627 .079l.062 .08 .277 .416C2.639 8.687 4.867 10 7.5 10c2.808 0 5.157-1.493 6.576-3.765l.061-.08Z"),
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
        return _eyeClosed!!
    }

private var _eyeClosed: ImageVector? = null
