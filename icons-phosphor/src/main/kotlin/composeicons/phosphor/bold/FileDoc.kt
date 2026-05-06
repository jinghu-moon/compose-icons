package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FileDoc: ImageVector
    get() {
        if (_fileDoc != null) return _fileDoc!!
        _fileDoc = phosphorBoldIcon(
            name = "FileDoc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M48 140h-16c-6.627 0-12 5.373-12 12v56c0 6.627 5.373 12 12 12h16c22.091 0 40-17.909 40-40C88 157.909 70.091 140 48 140ZM48 196h-4v-32h4c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16ZM228.3 192.2c2.309 2.202 3.646 5.233 3.716 8.423 .069 3.19-1.134 6.276-3.346 8.577C222.284 216.042 213.359 219.949 204 220c-19.85 0-36-17.94-36-40 0-22.06 16.15-40 36-40 9.364 .059 18.289 3.977 24.67 10.83 4.584 4.788 4.418 12.386-.37 16.97-4.788 4.584-12.386 4.418-16.97-.37C209.459 165.332 206.81 164.092 204 164c-6.5 0-12 7.33-12 16 0 8.67 5.5 16 12 16 2.81-.092 5.459-1.332 7.33-3.43 2.201-2.3 5.226-3.631 8.408-3.701 3.183-.069 6.263 1.129 8.562 3.331ZM128 140c-19.85 0-36 17.94-36 40 0 22.06 16.15 40 36 40 19.85 0 36-17.94 36-40 0-22.06-16.15-40-36-40ZM128 196c-6.5 0-12-7.33-12-16 0-8.67 5.5-16 12-16 6.5 0 12 7.33 12 16 0 8.67-5.5 16-12 16ZM48 120c6.627 0 12-5.373 12-12v-64h76v48c0 6.627 5.373 12 12 12h48v4c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-20c-0-3.18-1.263-6.23-3.51-8.48l-56-56C158.239 21.266 155.185 20 152 20h-96C44.954 20 36 28.954 36 40v68c0 6.627 5.373 12 12 12ZM160 57l23 23h-23Z"),
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
        return _fileDoc!!
    }

private var _fileDoc: ImageVector? = null
