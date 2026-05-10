package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Basketball: ImageVector
    get() {
        if (_basketball != null) return _basketball!!
        _basketball = phosphorFillIcon(
            name = "Basketball",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M63.6 46.39c14.998-11.886 32.998-19.38 52-21.65 1.136-.129 2.274 .235 3.124 1 .851 .765 1.333 1.857 1.326 3v91.26h-24.35C93.712 94.242 82.188 70.152 63.38 52.44c-.851-.791-1.317-1.914-1.274-3.075 .042-1.162 .588-2.247 1.494-2.975ZM46 64.07C34.336 78.956 26.972 96.754 24.71 115.53c-.135 1.14 .226 2.282 .991 3.137 .765 .855 1.861 1.34 3.009 1.333h50.92C77.657 98.419 67.777 78.329 51.89 63.59c-.823-.766-1.93-1.151-3.051-1.06-1.121 .091-2.151 .65-2.839 1.54ZM192.4 46.39C177.402 34.504 159.402 27.01 140.4 24.74c-1.136-.129-2.274 .235-3.124 1-.851 .765-1.333 1.857-1.326 3v91.26h24.3c1.988-25.758 13.512-49.848 32.32-67.56 .857-.784 1.331-1.902 1.299-3.064-.033-1.161-.569-2.251-1.469-2.986ZM231.26 115.53C229.006 96.757 221.654 78.96 210 64.07c-.688-.88-1.712-1.432-2.825-1.523-1.113-.091-2.213 .287-3.035 1.043C188.242 78.324 178.351 98.415 176.37 120h50.91c1.144 .002 2.234-.486 2.995-1.34 .761-.854 1.119-1.994 .985-3.13ZM24.74 140.47c2.254 18.773 9.606 36.57 21.26 51.46 .688 .88 1.712 1.432 2.825 1.523 1.113 .091 2.213-.287 3.035-1.043C67.758 177.676 77.649 157.585 79.63 136h-50.91c-1.144-.002-2.234 .486-2.995 1.34-.761 .854-1.119 1.994-.985 3.13ZM210 191.93c11.664-14.886 19.028-32.684 21.29-51.46 .135-1.14-.226-2.282-.991-3.137-.765-.855-1.861-1.34-3.009-1.333h-50.92c1.973 21.581 11.853 41.671 27.74 56.41 .823 .766 1.93 1.151 3.051 1.06 1.121-.091 2.151-.65 2.839-1.54ZM63.6 209.61c14.998 11.886 32.998 19.38 52 21.65 1.136 .129 2.274-.235 3.124-1 .851-.765 1.333-1.857 1.326-3v-91.26h-24.35c-1.988 25.758-13.512 49.848-32.32 67.56-.851 .791-1.317 1.914-1.274 3.075 .042 1.162 .588 2.247 1.494 2.975ZM160.3 136h-24.3v91.28c-.007 1.144 .475 2.236 1.326 3 .851 .765 1.988 1.128 3.124 1 19.002-2.27 37.002-9.764 52-21.65 .907-.727 1.452-1.813 1.494-2.975 .042-1.162-.423-2.284-1.274-3.075C173.839 185.871 162.296 161.772 160.3 136Z"),
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
        return _basketball!!
    }

private var _basketball: ImageVector? = null
