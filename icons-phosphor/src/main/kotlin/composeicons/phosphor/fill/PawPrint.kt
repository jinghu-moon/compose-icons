package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PawPrint: ImageVector
    get() {
        if (_pawPrint != null) return _pawPrint!!
        _pawPrint = phosphorFillIcon(
            name = "PawPrint",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 108c0 15.464-12.536 28-28 28-15.464 0-28-12.536-28-28 0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28ZM72 108C72 92.536 59.464 80 44 80 28.536 80 16 92.536 16 108c0 15.464 12.536 28 28 28 15.464 0 28-12.536 28-28ZM92 88c15.464 0 28-12.536 28-28C120 44.536 107.464 32 92 32 76.536 32 64 44.536 64 60c0 15.464 12.536 28 28 28ZM164 88c15.464 0 28-12.536 28-28C192 44.536 179.464 32 164 32c-15.464 0-28 12.536-28 28 0 15.464 12.536 28 28 28ZM187.12 148.86c-8.207-4.528-14.276-12.133-16.87-21.14C164.786 108.93 147.569 96.006 128 96.006c-19.569 0-36.786 12.924-42.25 31.714C83.181 136.694 77.157 144.282 69 148.82c-16.098 8.71-24.229 27.236-19.745 44.981C53.74 211.546 69.697 223.984 88 224c5.332 .015 10.611-1.049 15.52-3.13 15.651-6.454 33.219-6.454 48.87 0 19.699 8.568 42.648 .046 51.981-19.303 9.333-19.348 1.717-42.614-17.251-52.697Z"),
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
        return _pawPrint!!
    }

private var _pawPrint: ImageVector? = null
