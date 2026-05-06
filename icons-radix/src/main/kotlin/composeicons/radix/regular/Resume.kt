package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Resume: ImageVector
    get() {
        if (_resume != null) return _resume!!
        _resume = radixIcon(
            name = "Resume",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2.5 2.2c.304 0 .55 .246 .55 .55v9.5c0 .304-.246 .55-.55 .55-.304-0-.55-.246-.55-.55v-9.5c0-.304 .246-.55 .55-.55ZM5.242 2.322c.15-.09 .336-.096 .491-.015l9 4.75c.164 .087 .266 .257 .267 .442 0 .185-.103 .356-.267 .442L5.733 12.692c-.155 .082-.341 .076-.491-.015-.15-.09-.242-.253-.242-.428v-9.5c0-.175 .092-.337 .242-.428ZM6 11.42 13.427 7.5 6 3.579v7.841Z"),
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
        return _resume!!
    }

private var _resume: ImageVector? = null
