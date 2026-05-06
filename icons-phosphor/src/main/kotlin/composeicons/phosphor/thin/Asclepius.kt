package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Asclepius: ImageVector
    get() {
        if (_asclepius != null) return _asclepius!!
        _asclepius = phosphorThinIcon(
            name = "Asclepius",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212 79v1c0 19.882-16.118 36-36 36h-44v88h12c8.293-0 15.726-5.118 18.684-12.866 2.958-7.747 .828-16.517-5.354-22.044-1.657-1.475-1.805-4.013-.33-5.67 1.475-1.657 4.013-1.805 5.67-.33 8.684 7.734 11.684 20.031 7.537 30.895C166.06 204.85 155.629 212.02 144 212h-12v20c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-20h-28c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h28v-88h-28c-11.046 0-20 8.954-20 20 0 11.046 8.954 20 20 20 2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4C80.536 164 68 151.464 68 136c0-15.464 12.536-28 28-28h28v-84c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v84h44c15.464 0 28-12.536 28-28v-1C204 64.088 191.912 52 177 52h-17c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h17c19.33 0 35 15.67 35 35ZM56 92h-24c-2.209 0-4-1.791-4-4v-8C28 60.118 44.118 44 64 44h32c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-4v4C92 75.882 75.882 92 56 92ZM84 56v-4h-20C48.536 52 36 64.536 36 80v4h20C71.464 84 84 71.464 84 56Z"),
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
        return _asclepius!!
    }

private var _asclepius: ImageVector? = null
