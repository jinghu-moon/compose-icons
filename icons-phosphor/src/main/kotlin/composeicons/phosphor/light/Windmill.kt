package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Windmill: ImageVector
    get() {
        if (_windmill != null) return _windmill!!
        _windmill = phosphorLightIcon(
            name = "Windmill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 226h-42.8l-7.13-49.95 6.82 4c3.199 1.889 7.018 2.428 10.616 1.5 3.597-.928 6.678-3.249 8.564-6.45l12-20.34c1.885-3.205 2.417-7.029 1.479-10.627-.938-3.598-3.269-6.675-6.479-8.553L170.36 114 212.06 43.14c1.881-3.205 2.412-7.026 1.474-10.621-.938-3.596-3.267-6.671-6.474-8.549L186.77 12c-3.205-1.885-7.029-2.417-10.627-1.479-3.598 .938-6.675 3.269-8.553 6.479L146 53.65 75.11 11.94C71.905 10.055 68.081 9.523 64.483 10.461c-3.598 .938-6.675 3.269-8.553 6.479l-12 20.34c-1.881 3.205-2.412 7.026-1.474 10.621 .938 3.596 3.267 6.671 6.474 8.549L85.64 78 43.94 148.85c-1.885 3.205-2.417 7.029-1.479 10.627 .938 3.598 3.269 6.675 6.479 8.553l20.33 12c2.132 1.274 4.566 1.954 7.05 1.97 1.192 0 2.378-.154 3.53-.46 .46-.12 .91-.26 1.36-.42L74.8 226h-42.8c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h192c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM201.94 147.16c.129 .513 .05 1.056-.22 1.51l-12 20.34c-.269 .461-.711 .795-1.227 .928-.516 .133-1.065 .055-1.523-.218L116.12 128l14-23.8L201 145.93c.466 .267 .804 .71 .94 1.23ZM177.93 23c.271-.458 .714-.789 1.23-.92 .511-.132 1.054-.057 1.51 .21l20.34 12c.463 .269 .799 .713 .933 1.231 .133 .519 .053 1.069-.223 1.529L160 107.88l-23.81-14ZM54.06 44.85c-.132-.516-.053-1.063 .22-1.52L66.27 23c.556-.951 1.777-1.273 2.73-.72L139.88 64 125.88 87.8 55 46.07c-.464-.265-.802-.704-.94-1.22ZM78.07 169c-.269 .458-.709 .79-1.223 .923-.514 .133-1.06 .057-1.517-.213L55 157.73c-.461-.269-.795-.711-.928-1.227-.133-.516-.055-1.065 .218-1.523L96 84.12l23.81 14ZM96.07 162.12l14-23.77 50.8 29.9L169.08 226h-82.16Z"),
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
        return _windmill!!
    }

private var _windmill: ImageVector? = null
