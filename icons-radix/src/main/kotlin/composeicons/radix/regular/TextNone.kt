package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.TextNone: ImageVector
    get() {
        if (_textNone != null) return _textNone!!
        _textNone = radixIcon(
            name = "TextNone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.646 1.646c.195-.195 .512-.195 .707 0 .195 .195 .195 .512 0 .707L8.05 7.657v4.393h1.204c.248 0 .45 .202 .45 .45-0 .217-.154 .398-.359 .44l-.091 .01h-3.5l-.091-.01c-.205-.042-.359-.223-.359-.44 0-.217 .155-.398 .359-.441l.091-.01h1.196v-3.293L2.353 13.354c-.195 .195-.512 .195-.707 0-.195-.195-.195-.512 0-.707L6.95 7.343v-4.393h-3v1.55c-0 .248-.202 .45-.45 .45C3.252 4.95 3.05 4.748 3.05 4.5v-2c0-.055 .011-.107 .028-.155 .002-.004 .002-.009 .004-.014 .005-.013 .012-.024 .019-.036 .006-.013 .013-.025 .021-.037 .007-.01 .014-.02 .021-.03 .006-.008 .011-.015 .018-.022l.021-.023c.005-.005 .01-.008 .015-.013 .012-.011 .024-.022 .037-.031 .009-.007 .019-.013 .028-.019 .013-.008 .026-.015 .039-.021 .011-.006 .022-.012 .034-.017 .015-.006 .032-.01 .048-.015 .01-.003 .021-.007 .031-.009 .028-.005 .057-.008 .086-.008h8l.079 .007c.003 .001 .007 .001 .01 .002l.002 .001c.005 .001 .01 .003 .016 .004 .018 .004 .035 .009 .052 .016 .013 .005 .025 .011 .037 .017 .009 .005 .019 .009 .028 .014l.01 .006c.005 .003 .01 .007 .016 .011 .034 .023 .066 .051 .093 .082 .038 .045 .067 .098 .086 .156l.719-.718ZM8.05 6.243 11.05 3.243v-.293h-3v3.293Z"),
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
        return _textNone!!
    }

private var _textNone: ImageVector? = null
