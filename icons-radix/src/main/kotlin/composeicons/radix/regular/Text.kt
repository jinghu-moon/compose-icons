package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Text: ImageVector
    get() {
        if (_text != null) return _text!!
        _text = radixIcon(
            name = "Text",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.579 2.057c.003 .001 .007 .001 .01 .002l.002 .001c.005 .001 .01 .003 .016 .004 .018 .004 .035 .009 .052 .016 .013 .005 .025 .011 .037 .017 .009 .005 .019 .008 .028 .014l.01 .006c.005 .003 .01 .007 .016 .011 .035 .023 .066 .05 .093 .082 .067 .079 .108 .18 .108 .292v2c-0 .248-.202 .45-.45 .45-.248 0-.45-.202-.45-.45v-1.55h-3v9.1h1.204c.249 0 .45 .202 .45 .45-0 .217-.154 .398-.359 .44l-.091 .01h-3.5l-.091-.01c-.205-.042-.359-.223-.359-.44 0-.217 .155-.398 .359-.44l.091-.01h1.196v-9.1h-3v1.55c-0 .248-.202 .45-.45 .45-.248 0-.45-.202-.45-.45v-2c0-.055 .01-.107 .028-.155 .002-.004 .002-.009 .004-.014 .005-.013 .012-.024 .019-.036 .006-.013 .013-.025 .021-.037 .007-.01 .014-.02 .021-.03 .006-.008 .011-.015 .018-.022l.021-.023c.005-.005 .01-.008 .015-.013 .012-.011 .024-.022 .037-.031 .009-.007 .019-.013 .028-.019 .013-.008 .026-.015 .039-.021 .011-.006 .022-.012 .034-.017 .015-.006 .032-.01 .048-.015 .01-.003 .021-.007 .031-.009 .028-.005 .057-.008 .086-.008h8l.079 .007Z"),
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
        return _text!!
    }

private var _text: ImageVector? = null
