package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FlyingSaucer: ImageVector
    get() {
        if (_flyingSaucer != null) return _flyingSaucer!!
        _flyingSaucer = phosphorDuotoneIcon(
            name = "FlyingSaucer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 112c0 26.51-50.14 48-112 48C66.14 160 16 138.51 16 112 16 93 41.86 76.51 79.35 68.75h0C74.521 77.32 71.989 86.993 72 96.83v3.07c.004 7.413 5.118 13.846 12.34 15.52 14.336 3.158 28.981 4.694 43.66 4.58 14.672 .114 29.311-1.422 43.64-4.58 7.217-1.686 12.332-8.108 12.36-15.52v-3.9c.025-9.509-2.385-18.866-7-27.18h0C214.29 76.61 240 93 240 112Z"),
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
                pathData = parseSvgPathData("M183.59 213.47c1.397 4.192-.868 8.723-5.06 10.12-4.192 1.397-8.723-.868-10.12-5.06l-8-24c-1.397-4.192 .868-8.723 5.06-10.12 4.192-1.397 8.723 .868 10.12 5.06ZM128 184c-4.418 0-8 3.582-8 8v32c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-32c0-4.418-3.582-8-8-8ZM90.53 184.41c-2.013-.671-4.21-.515-6.108 .434-1.898 .949-3.341 2.613-4.012 4.626l-8 24c-1.397 4.192 .868 8.723 5.06 10.12 4.192 1.397 8.723-.868 10.12-5.06l8-24c.671-2.013 .515-4.21-.434-6.108-.949-1.898-2.613-3.341-4.626-4.012ZM248 112c0 16.22-13.37 30.89-37.65 41.29C188.22 162.78 159 168 128 168 97 168 67.78 162.78 45.65 153.29 21.37 142.89 8 128.22 8 112 8 103.63 11.67 91.21 29.17 79.5 40.54 71.89 56.11 65.74 74.35 61.65 84.653 45.326 101.808 34.561 120.988 32.383c19.18-2.178 38.312 4.468 52.012 18.067 3.45 3.414 6.506 7.204 9.11 11.3C223.43 71.09 248 89.74 248 112ZM80 96.83v3c-.021 3.701 2.524 6.924 6.13 7.76 13.748 3.031 27.792 4.51 41.87 4.41 14.07 .113 28.107-1.353 41.85-4.37 3.611-.832 6.165-4.054 6.15-7.76v-3.87c.001-12.842-5.144-25.149-14.284-34.169C152.575 52.81 140.201 47.829 127.36 48 101.25 48.34 80 70.25 80 96.83ZM232 112C232 100.3 215.37 88.11 190.1 80.41c1.264 5.1 1.902 10.335 1.9 15.59v3.92c.017 11.149-7.689 20.823-18.56 23.3C158.52 126.509 143.278 128.113 128 128c-15.278 .112-30.52-1.491-45.44-4.78C71.689 120.743 63.983 111.069 64 99.92h0v-3.06c.002-5.575 .717-11.127 2.13-16.52C40.72 88 24 100.25 24 112c0 18.92 42.71 40 104 40 61.29 0 104-21.08 104-40Z"),
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
        return _flyingSaucer!!
    }

private var _flyingSaucer: ImageVector? = null
