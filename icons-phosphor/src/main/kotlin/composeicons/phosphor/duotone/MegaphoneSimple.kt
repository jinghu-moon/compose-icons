package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.MegaphoneSimple: ImageVector
    get() {
        if (_megaphoneSimple != null) return _megaphoneSimple!!
        _megaphoneSimple = phosphorDuotoneIcon(
            name = "MegaphoneSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M144 69.09v101.82L50.24 199.67c-2.416 .705-5.022 .232-7.036-1.277C41.19 196.884 40.003 194.516 40 192v-144c.003-2.516 1.19-4.884 3.204-6.393 2.014-1.509 4.62-1.982 7.036-1.277Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M228.54 86.66 52.48 32.66C47.649 31.251 42.436 32.197 38.408 35.214 34.38 38.231 32.006 42.967 32 48v144c0 8.837 7.163 16 16 16 1.53 .001 3.052-.218 4.52-.65L136 181.73v10.27c0 8.837 7.163 16 16 16h32c8.837 0 16-7.163 16-16v-29.9l28.54-8.75C235.322 151.312 239.974 145.081 240 138v-36c-.031-7.077-4.682-13.304-11.46-15.34ZM136 165 48 192v-144l88 27ZM184 192h-32v-15.18L184 167ZM224 138h-.11L152 160.08v-80.16l71.89 22h.11v36Z"),
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
        return _megaphoneSimple!!
    }

private var _megaphoneSimple: ImageVector? = null
