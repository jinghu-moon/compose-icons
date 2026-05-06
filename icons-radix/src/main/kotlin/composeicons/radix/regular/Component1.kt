package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Component1: ImageVector
    get() {
        if (_component1 != null) return _component1!!
        _component1 = radixIcon(
            name = "Component1",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.224 8.607c.194-.128 .458-.106 .629 .064l2.476 2.475c.195 .195 .195 .512 0 .707L7.853 14.329c-.195 .195-.512 .195-.707 0L4.671 11.853l-.064-.078c-.128-.194-.106-.458 .064-.629L7.146 8.672l.078-.064ZM5.732 11.5l1.768 1.768L9.267 11.5 7.499 9.732 5.732 11.5ZM3.224 4.607c.194-.128 .458-.106 .629 .064L6.329 7.146c.195 .195 .195 .512 0 .707L3.853 10.329c-.195 .195-.512 .195-.707 0L.671 7.853 .607 7.776C.479 7.582 .5 7.317 .671 7.146L3.146 4.672l.078-.064ZM11.224 4.607c.194-.128 .458-.106 .629 .064l2.476 2.475c.195 .195 .195 .512 0 .707l-2.476 2.476c-.195 .195-.512 .195-.707 0L8.671 7.853 8.607 7.775c-.128-.194-.106-.458 .064-.629L11.146 4.672l.078-.064ZM1.732 7.5 3.499 9.268 5.267 7.5 3.499 5.732 1.732 7.5ZM9.732 7.5l1.768 1.768L13.267 7.5 11.499 5.732 9.732 7.5ZM7.224 .607c.194-.128 .458-.106 .629 .064l2.476 2.475c.195 .195 .195 .512 0 .707L7.853 6.329c-.195 .195-.512 .195-.707 0L4.671 3.853 4.607 3.775c-.128-.194-.106-.458 .064-.629L7.146 .672 7.224 .607ZM5.732 3.5 7.499 5.267 9.267 3.5 7.499 1.732 5.732 3.5Z"),
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
        return _component1!!
    }

private var _component1: ImageVector? = null
