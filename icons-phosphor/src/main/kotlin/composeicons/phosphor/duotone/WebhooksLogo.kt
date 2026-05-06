package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.WebhooksLogo: ImageVector
    get() {
        if (_webhooksLogo != null) return _webhooksLogo!!
        _webhooksLogo = phosphorDuotoneIcon(
            name = "WebhooksLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 104C105.909 104 88 86.091 88 64 88 41.909 105.909 24 128 24c22.091 0 40 17.909 40 40 0 22.091-17.909 40-40 40ZM192 128c-22.091 0-40 17.909-40 40 0 22.091 17.909 40 40 40 22.091 0 40-17.909 40-40 0-22.091-17.909-40-40-40ZM64 128c-22.091 0-40 17.909-40 40 0 22.091 17.909 40 40 40 22.091 0 40-17.909 40-40C104 145.909 86.091 128 64 128Z"),
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
                pathData = parseSvgPathData("M178.16 176h-66.84c-3.316 19.625-18.399 35.167-37.916 39.07C53.888 218.973 33.988 210.427 23.379 193.588 12.77 176.748 13.653 155.108 25.6 139.19c2.654-3.535 7.67-4.249 11.205-1.595 3.535 2.654 4.249 7.67 1.595 11.205C34.225 154.328 31.977 161.073 32 168c0 17.673 14.327 32 32 32 17.673 0 32-14.327 32-32 0-4.418 3.582-8 8-8h74.16c3.621-6.271 11.003-9.329 17.998-7.455 6.995 1.874 11.859 8.213 11.859 15.455 0 7.242-4.864 13.581-11.859 15.455-6.995 1.874-14.377-1.183-17.998-7.455ZM64 184c5.638 .002 10.86-2.963 13.748-7.805 2.887-4.842 3.014-10.846 .332-15.805l35.77-58.14c2.312-3.761 1.139-8.684-2.62-11C99.495 84.026 93.703 70.101 96.853 56.686c3.15-13.415 14.533-23.308 28.257-24.555 13.723-1.247 26.704 6.431 32.22 19.059 1.767 4.051 6.484 5.902 10.535 4.135 4.051-1.767 5.902-6.484 4.135-10.535C164.112 26.758 146.015 15.368 126.345 16.057 106.675 16.745 89.419 29.371 82.81 47.911c-6.609 18.539-1.23 39.234 13.57 52.209L64.44 152c-.15 0-.29 0-.44 0-8.837 0-16 7.163-16 16 0 8.837 7.163 16 16 16ZM192 120c-6.168 0-12.279 1.185-18 3.49L142.08 71.6c3.42-6.335 2.187-14.174-3.012-19.154-5.199-4.98-13.083-5.875-19.266-2.186-6.182 3.688-9.14 11.052-7.227 17.992C114.488 75.192 120.801 80 128 80h.44l35.78 58.15c2.319 3.755 7.241 4.923 11 2.61 11.549-7.119 26.332-6.182 36.89 2.338 10.558 8.521 14.595 22.773 10.074 35.565C217.663 191.455 205.567 200.005 192 200c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 26.51 0 48-21.49 48-48 0-26.51-21.49-48-48-48Z"),
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
        return _webhooksLogo!!
    }

private var _webhooksLogo: ImageVector? = null
