package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HandTap: ImageVector
    get() {
        if (_handTap != null) return _handTap!!
        _handTap = phosphorFillIcon(
            name = "HandTap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M64 64C64 37.49 85.49 16 112 16c26.51 0 48 21.49 48 48 0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8C144 46.327 129.673 32 112 32 94.327 32 80 46.327 80 64c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8ZM207.23 120c-8.61 .4-15.23 7.82-15.23 16.43v7.28c.058 4.283-3.202 7.883-7.47 8.25-2.212 .147-4.386-.631-6.003-2.147-1.617-1.516-2.532-3.636-2.527-5.853v-23.51c0-8.61-6.62-16-15.23-16.43-4.372-.211-8.639 1.379-11.808 4.398-3.169 3.019-4.962 7.205-4.962 11.582v15.73c.058 4.283-3.202 7.883-7.47 8.25-2.212 .147-4.386-.631-6.003-2.147-1.617-1.517-2.532-3.636-2.527-5.853v-71.53c0-8.61-6.62-16-15.23-16.43-4.372-.211-8.639 1.379-11.808 4.398C97.794 55.438 96 59.623 96 64v119.74c.05 3.995-2.79 7.443-6.72 8.16h-.12c-2.44 .274-4.806-.945-6-3.09L62.16 152.37C57.86 144.91 48.42 141.8 40.76 145.75c-3.912 1.989-6.835 5.498-8.084 9.705-1.25 4.207-.717 8.742 1.474 12.545l30.95 60.05c1.437 2.447 4.062 3.95 6.9 3.95h136c3.031 .002 5.803-1.709 7.16-4.42 .36-.72 8.84-15.06 8.84-40.65v-50.93c.005-4.38-1.786-8.571-4.955-11.595-3.169-3.024-7.44-4.616-11.815-4.405Z"),
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
        return _handTap!!
    }

private var _handTap: ImageVector? = null
