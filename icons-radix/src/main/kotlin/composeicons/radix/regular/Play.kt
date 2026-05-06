package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Play: ImageVector
    get() {
        if (_play != null) return _play!!
        _play = radixIcon(
            name = "Play",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3.242 2.322c.15-.09 .336-.096 .491-.015l9 4.75c.164 .087 .267 .257 .267 .442 0 .185-.103 .356-.267 .442L3.733 12.692c-.155 .082-.341 .076-.491-.015C3.092 12.587 3 12.425 3 12.25v-9.5c0-.175 .092-.337 .242-.428ZM4 11.42 11.428 7.5 4 3.579v7.841Z"),
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
        return _play!!
    }

private var _play: ImageVector? = null
