package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CigaretteSlash: ImageVector
    get() {
        if (_cigaretteSlash != null) return _cigaretteSlash!!
        _cigaretteSlash = phosphorFillIcon(
            name = "CigaretteSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M201 60.08c8-14.23 7.42-21.71 6.36-24.91-.464-1.527-1.385-2.874-2.64-3.86-2.625-1.152-4.433-3.622-4.739-6.472-.306-2.851 .938-5.647 3.259-7.33 2.321-1.683 5.365-1.995 7.98-.818 5.434 2.767 9.517 7.615 11.32 13.44 3.36 10.14 .81 22.85-7.6 37.79-8 14.23-7.42 21.72-6.36 24.92 .466 1.523 1.387 2.867 2.64 3.85 2.625 1.152 4.433 3.622 4.739 6.472 .306 2.851-.938 5.647-3.259 7.33-2.321 1.683-5.365 1.995-7.98 .818-5.437-2.763-9.521-7.613-11.32-13.44C190.07 87.73 192.62 75 201 60.08ZM153.4 97.87c1.799 5.827 5.883 10.677 11.32 13.44 2.614 1.177 5.659 .865 7.98-.818 2.321-1.683 3.564-4.479 3.259-7.33-.306-2.851-2.113-5.32-4.739-6.472-1.253-.983-2.174-2.327-2.64-3.85-1.06-3.2-1.64-10.69 6.36-24.92 8.41-14.94 11-27.65 7.6-37.79C180.737 24.305 176.654 19.457 171.22 16.69c-2.614-1.177-5.659-.865-7.98 .818-2.321 1.683-3.564 4.479-3.259 7.33 .306 2.851 2.113 5.32 4.739 6.472 1.255 .986 2.176 2.333 2.64 3.86C168.42 38.37 169 45.85 161 60.08 152.62 75 150.07 87.73 153.43 97.87ZM213.89 210.62c1.963 2.109 2.641 5.11 1.774 7.858-.867 2.748-3.144 4.817-5.961 5.418-2.818 .601-5.741-.36-7.653-2.515L175.37 192h-143.37c-8.837 0-16-7.163-16-16v-32c0-8.837 7.163-16 16-16h85.19L42.08 45.38C40.117 43.271 39.439 40.27 40.306 37.522c.867-2.748 3.144-4.817 5.961-5.418 2.818-.601 5.741 .36 7.653 2.515ZM160.82 176 131.73 144h-35.73v32ZM224 128h-45.48c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h45.48v32h-1.84c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h1.84c8.837 0 16-7.163 16-16v-32c0-8.837-7.163-16-16-16Z"),
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
        return _cigaretteSlash!!
    }

private var _cigaretteSlash: ImageVector? = null
