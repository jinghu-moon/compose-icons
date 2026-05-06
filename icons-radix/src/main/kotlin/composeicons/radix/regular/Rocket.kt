package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Rocket: ImageVector
    get() {
        if (_rocket != null) return _rocket!!
        _rocket = radixIcon(
            name = "Rocket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.646 12.646c.195-.195 .512-.195 .707 0 .195 .195 .195 .512 0 .707l-1 1c-.195 .195-.512 .195-.707 0-.195-.195-.195-.512 0-.707l1-1ZM10.41 .812c.627-.09 1.251-.101 1.794-.02 .528 .079 1.051 .256 1.399 .604 .348 .348 .525 .871 .604 1.399 .081 .543 .07 1.166-.019 1.794-.177 1.239-.68 2.608-1.535 3.464l-.623 .623 .465 3.253c.022 .156-.03 .313-.142 .424l-2 2c-.109 .109-.262 .161-.415 .143-.153-.019-.288-.107-.367-.238L8.4 12.307l-.547 .547c-.195 .195-.512 .195-.707 0L5.646 11.354c-.195-.195-.195-.512 0-.707 .195-.195 .512-.195 .707 0l1.146 1.147L11.946 7.347c.645-.645 1.092-1.775 1.253-2.898 .079-.554 .083-1.078 .02-1.505-.066-.442-.196-.713-.322-.84-.127-.127-.398-.256-.84-.322-.427-.064-.951-.059-1.505 .021C9.499 1.952 8.44 2.355 7.78 2.936l-.127 .118L3.207 7.5 4.353 8.646c.195 .195 .195 .512 0 .707-.195 .195-.512 .195-.707 0L2.146 7.854C2.053 7.76 2 7.633 2 7.5c0-.133 .053-.26 .146-.354l.547-.547L.743 5.429C.611 5.35 .523 5.214 .504 5.062 .485 4.909 .538 4.755 .646 4.647l2-2c.111-.111 .268-.164 .424-.142l3.253 .465 .623-.623C7.802 1.491 9.171 .989 10.41 .812ZM3.146 11.146c.195-.195 .512-.195 .707 0 .195 .195 .195 .512 0 .707l-2 2c-.195 .195-.512 .195-.707 0-.195-.195-.195-.512 0-.707l2-2ZM9.13 11.578l.97 1.615 1.37-1.37L11.146 9.561 9.13 11.578ZM1.646 9.646c.195-.195 .512-.195 .707 0 .195 .195 .195 .512 0 .707l-1 1c-.195 .195-.512 .195-.707 0-.195-.195-.195-.512 0-.707l1-1ZM9.5 4.251c.69 0 1.249 .559 1.249 1.249 0 .69-.559 1.249-1.249 1.249C8.81 6.749 8.251 6.19 8.251 5.5 8.251 4.81 8.81 4.251 9.5 4.251ZM1.807 4.9l1.616 .97L5.439 3.854 3.177 3.53 1.807 4.9Z"),
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
        return _rocket!!
    }

private var _rocket: ImageVector? = null
