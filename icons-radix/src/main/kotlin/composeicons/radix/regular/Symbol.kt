package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Symbol: ImageVector
    get() {
        if (_symbol != null) return _symbol!!
        _symbol = radixIcon(
            name = "Symbol",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.988 1.563c.053-.283 .326-.47 .608-.417l.269 .057c2.764 .637 5.188 3.036 5.189 6.501-0 1.536-.699 2.744-1.516 3.663-.585 .658-1.255 1.192-1.793 1.602h1.638c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5h-3c-.276 0-.5-.224-.5-.5v-3c0-.276 .224-.5 .5-.5 .276 0 .5 .224 .5 .5v1.846l.182-.138c.534-.405 1.152-.891 1.694-1.502 .715-.804 1.252-1.776 1.252-2.971C13.01 4.692 10.85 2.631 8.404 2.171L8.302 2.141C8.078 2.049 7.942 1.81 7.988 1.563ZM.861 7.297C.861 5.761 1.56 4.553 2.376 3.634 2.961 2.976 3.631 2.442 4.169 2.032h-1.638C2.256 2.032 2.032 1.808 2.032 1.532c0-.276 .224-.5 .5-.5h3c.276 0 .5 .224 .5 .5v3c-0 .276-.224 .5-.5 .5C5.256 5.032 5.032 4.808 5.032 4.532v-1.846l-.182 .138C4.316 3.229 3.698 3.716 3.156 4.326 2.441 5.13 1.904 6.102 1.904 7.297c0 3.044 2.207 5.118 4.686 5.547 .283 .049 .474 .319 .425 .603-.049 .283-.319 .474-.603 .425C3.5 13.367 .861 10.913 .861 7.297Z"),
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
        return _symbol!!
    }

private var _symbol: ImageVector? = null
