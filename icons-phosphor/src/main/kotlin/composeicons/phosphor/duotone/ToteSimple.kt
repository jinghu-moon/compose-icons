package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ToteSimple: ImageVector
    get() {
        if (_toteSimple != null) return _toteSimple!!
        _toteSimple = phosphorDuotoneIcon(
            name = "ToteSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M231.94 80.93 217.69 200.93c-.5 4.038-3.931 7.071-8 7.07h-163.36c-4.069 .001-7.5-3.032-8-7.07L24.08 80.93c-.267-2.278 .457-4.56 1.987-6.268C27.597 72.954 29.787 71.984 32.08 72h191.84c2.297-.021 4.492 .945 6.026 2.654 1.535 1.709 2.261 3.995 1.994 6.276Z"),
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
                pathData = parseSvgPathData("M236 69.4C232.931 65.955 228.534 63.99 223.92 64h-47.92C176 37.49 154.51 16 128 16 101.49 16 80 37.49 80 64h-47.92c-4.586 .012-8.949 1.976-12 5.4-3.025 3.411-4.451 7.951-3.92 12.48L30.42 201.88c.958 8.095 7.848 14.176 16 14.12h163.25c8.152 .056 15.042-6.025 16-14.12L239.93 81.88c.529-4.53-.901-9.07-3.93-12.48ZM128 32c17.673 0 32 14.327 32 32h-64C96 46.327 110.327 32 128 32ZM209.76 200c-.029 .011-.061 .011-.09 0h-163.42L32.08 80h191.92Z"),
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
        return _toteSimple!!
    }

private var _toteSimple: ImageVector? = null
