package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Scissors: ImageVector
    get() {
        if (_scissors != null) return _scissors!!
        _scissors = radixIcon(
            name = "Scissors",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.776 9.595c.112 .28 .175 .585 .175 .905-0 1.353-1.097 2.45-2.45 2.45C1.147 12.95 .05 11.853 .05 10.5 .05 9.147 1.147 8.05 2.5 8.05c.672 0 1.281 .271 1.724 .709L6.427 7.287l.253-.907c.072-.257 .243-.475 .477-.604L10.231 4.065c1.178-.656 2.477-1.066 3.818-1.207L15 2.757 4.776 9.595ZM15 12.241l-.951-.101c-1.341-.141-2.639-.552-3.817-1.207L7.156 9.222C7.152 9.22 7.149 9.216 7.145 9.214L8.811 8.1 15 12.241ZM2.5 8.95c-.856 0-1.55 .694-1.55 1.55 0 .856 .694 1.55 1.55 1.55 .856-0 1.55-.694 1.55-1.55C4.05 9.644 3.356 8.951 2.5 8.95ZM2.5 2.035c1.353 0 2.45 1.097 2.45 2.45-0 .323-.065 .631-.179 .914l.966 .646-.021 .067-.153 .55-.353 .235L4.214 6.233c-.442 .433-1.046 .702-1.714 .702C1.147 6.935 .05 5.838 .05 4.485 .05 3.132 1.147 2.035 2.5 2.035ZM2.5 2.935C1.644 2.935 .95 3.629 .95 4.485c0 .856 .694 1.55 1.55 1.55C3.356 6.034 4.05 5.341 4.05 4.485 4.05 3.629 3.356 2.935 2.5 2.935Z"),
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
        return _scissors!!
    }

private var _scissors: ImageVector? = null
