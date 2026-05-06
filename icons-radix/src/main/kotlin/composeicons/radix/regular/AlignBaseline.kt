package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.AlignBaseline: ImageVector
    get() {
        if (_alignBaseline != null) return _alignBaseline!!
        _alignBaseline = radixIcon(
            name = "AlignBaseline",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14.581 13.108c.182 .037 .319 .198 .319 .392 0 .193-.137 .354-.319 .392l-.081 .009h-14c-.221 0-.4-.18-.4-.4 0-.221 .18-.4 .4-.4h14l.081 .009ZM7.971 10.739c-.094 .26-.381 .394-.641 .301-.259-.094-.394-.38-.301-.64l.941 .339ZM10.5 1.75c.211 0 .399 .132 .471 .33l3 8.32c.093 .26-.041 .546-.301 .64-.26 .094-.547-.041-.641-.301L12.047 8.016h-3.094l-.982 2.724-.471-.17-.471-.169L10.029 2.08l.032-.071c.087-.158 .254-.259 .438-.259ZM2.5 2.1c.221 0 .4 .18 .4 .4v7.033L4.217 8.217c.156-.156 .41-.156 .566 0 .156 .156 .156 .41 0 .566l-2 2c-.075 .075-.177 .117-.283 .117-.106 0-.208-.042-.283-.117L.217 8.783 .166 8.72C.064 8.565 .08 8.353 .217 8.217 .353 8.08 .564 8.064 .72 8.166l.063 .051L2.099 9.533v-7.033c0-.221 .179-.4 .4-.4ZM9.259 7.166h2.482L10.5 3.725 9.259 7.166Z"),
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
        return _alignBaseline!!
    }

private var _alignBaseline: ImageVector? = null
