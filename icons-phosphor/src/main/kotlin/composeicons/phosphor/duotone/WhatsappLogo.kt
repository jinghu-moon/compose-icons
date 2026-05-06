package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.WhatsappLogo: ImageVector
    get() {
        if (_whatsappLogo != null) return _whatsappLogo!!
        _whatsappLogo = phosphorDuotoneIcon(
            name = "WhatsappLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 32C93.686 31.996 61.979 50.307 44.832 80.03c-17.146 29.723-17.124 66.338 .058 96.04L32.42 213.46c-.959 2.875-.211 6.045 1.932 8.188 2.143 2.143 5.313 2.891 8.188 1.932L79.93 211.11c34.943 20.202 78.791 16.389 109.722-9.541 30.932-25.93 42.34-68.439 28.548-106.372C204.409 57.264 168.363 32.009 128 32ZM152 184C107.817 184 72 148.183 72 104 72 86.327 86.327 72 104 72l16 32-12.32 18.47c4.887 11.677 14.173 20.963 25.85 25.85L152 136l32 16c0 17.673-14.327 32-32 32Z"),
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
                pathData = parseSvgPathData("M187.58 144.84l-32-16c-2.564-1.278-5.615-1.087-8 .5l-14.69 9.8c-6.743-3.707-12.293-9.257-16-16l9.8-14.69c1.587-2.385 1.778-5.436 .5-8l-16-32C109.837 65.718 107.049 63.992 104 64 81.909 64 64 81.909 64 104c.055 48.578 39.422 87.945 88 88 22.091 0 40-17.909 40-40 .002-3.031-1.709-5.803-4.42-7.16ZM152 176C112.254 175.956 80.044 143.746 80 104 79.997 92.558 88.071 82.705 99.29 80.46l11.48 23L101 118c-1.483 2.224-1.757 5.042-.73 7.51 5.724 13.604 16.546 24.426 30.15 30.15 2.476 1.073 5.326 .824 7.58-.66l14.62-9.74 23 11.48C173.356 167.977 163.462 176.044 152 176ZM128 24C91.477 23.992 57.627 43.143 38.822 74.453 20.017 105.763 19.014 144.642 36.18 176.88L24.83 210.93c-1.918 5.75-.421 12.09 3.865 16.375 4.286 4.286 10.626 5.782 16.375 3.865L79.12 219.82c38.207 20.321 85.005 14.86 117.505-13.713 32.501-28.573 43.911-74.286 28.651-114.781C210.016 50.831 171.275 24.018 128 24ZM128 216c-15.47 .011-30.669-4.063-44.06-11.81-1.983-1.15-4.365-1.394-6.54-.67L40 216 52.47 178.6c.727-2.174 .487-4.555-.66-6.54C31.866 137.578 37.571 93.999 65.721 65.814 93.87 37.629 137.442 31.868 171.949 51.769c34.507 19.901 51.343 60.5 41.045 98.98C202.697 189.229 167.834 215.993 128 216Z"),
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
        return _whatsappLogo!!
    }

private var _whatsappLogo: ImageVector? = null
