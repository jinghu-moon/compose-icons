package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PawPrint: ImageVector
    get() {
        if (_pawPrint != null) return _pawPrint!!
        _pawPrint = phosphorDuotoneIcon(
            name = "PawPrint",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 108c0 11.046-8.954 20-20 20-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20ZM64 108C64 96.954 55.046 88 44 88 32.954 88 24 96.954 24 108c0 11.046 8.954 20 20 20 11.046 0 20-8.954 20-20ZM92 80c11.046 0 20-8.954 20-20C112 48.954 103.046 40 92 40 80.954 40 72 48.954 72 60c0 11.046 8.954 20 20 20ZM164 80c11.046 0 20-8.954 20-20C184 48.954 175.046 40 164 40c-11.046 0-20 8.954-20 20 0 11.046 8.954 20 20 20ZM183.24 155.85C173.21 150.297 165.781 141.006 162.57 130 158.102 114.623 144.013 104.046 128 104.046c-16.013 0-30.102 10.577-34.57 25.954-3.202 11.023-10.632 20.333-20.67 25.9-15.141 8.073-21.22 26.652-13.779 42.114 7.441 15.462 25.753 22.302 41.509 15.506 17.622-7.225 37.379-7.225 55 0 15.756 6.796 34.068-.044 41.509-15.506 7.441-15.462 1.362-34.041-13.779-42.114Z"),
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
                pathData = parseSvgPathData("M212 80c-15.464 0-28 12.536-28 28 0 15.464 12.536 28 28 28 15.464 0 28-12.536 28-28C240 92.536 227.464 80 212 80ZM212 120c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM72 108C72 92.536 59.464 80 44 80 28.536 80 16 92.536 16 108c0 15.464 12.536 28 28 28 15.464 0 28-12.536 28-28ZM44 120c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM92 88c15.464 0 28-12.536 28-28C120 44.536 107.464 32 92 32 76.536 32 64 44.536 64 60c0 15.464 12.536 28 28 28ZM92 48c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12C85.373 72 80 66.627 80 60 80 53.373 85.373 48 92 48ZM164 88c15.464 0 28-12.536 28-28C192 44.536 179.464 32 164 32c-15.464 0-28 12.536-28 28 0 15.464 12.536 28 28 28ZM164 48c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12ZM187.12 148.86c-8.207-4.528-14.276-12.133-16.87-21.14C164.786 108.93 147.569 96.006 128 96.006c-19.569 0-36.786 12.924-42.25 31.714C83.181 136.694 77.157 144.282 69 148.82c-16.098 8.71-24.229 27.236-19.745 44.981C53.74 211.546 69.697 223.984 88 224c5.332 .015 10.611-1.049 15.52-3.13 15.651-6.454 33.219-6.454 48.87 0 19.699 8.568 42.648 .046 51.981-19.303 9.333-19.348 1.717-42.614-17.251-52.697ZM168 208c-3.248 .003-6.463-.654-9.45-1.93-19.594-8.093-41.596-8.093-61.19 0-11.832 5.095-25.576-.061-31.138-11.68-5.563-11.619-.96-25.558 10.428-31.58 11.9-6.572 20.7-17.606 24.46-30.67 3.473-11.964 14.432-20.194 26.89-20.194 12.458 0 23.417 8.231 26.89 20.194 3.772 13.089 12.598 24.138 24.53 30.71 9.709 5.207 14.625 16.355 11.924 27.035C188.642 200.566 179.017 208.035 168 208Z"),
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
