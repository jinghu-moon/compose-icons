package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Blueprint: ImageVector
    get() {
        if (_blueprint != null) return _blueprint!!
        _blueprint = phosphorThinIcon(
            name = "Blueprint",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 60h-164v-20c0-2.209-1.791-4-4-4h-16C32.536 36 20 48.536 20 64v112c0 15.464 12.536 28 28 28h184c2.209 0 4-1.791 4-4v-136c0-2.209-1.791-4-4-4ZM28 64C28 52.954 36.954 44 48 44h12v104h-12c-7.529-.003-14.74 3.033-20 8.42ZM228 196h-180C36.954 196 28 187.046 28 176c0-11.046 8.954-20 20-20h16c2.209 0 4-1.791 4-4v-84h160ZM104 140c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h20v12c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-12h32v12c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-12h20c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-20v-24h20c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-20v-12c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v12h-32v-12c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v12h-20c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h20v24ZM132 116h32v24h-32Z"),
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
        return _blueprint!!
    }

private var _blueprint: ImageVector? = null
