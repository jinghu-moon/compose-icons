package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Lego: ImageVector
    get() {
        if (_lego != null) return _lego!!
        _lego = phosphorThinIcon(
            name = "Lego",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M241.79 76.42 194.37 52.71C189.84 42.92 176.36 36 160 36c-20.19 0-36 10.54-36 24 .013 2.95 .77 5.85 2.2 8.43L101.65 80.7C94.885 77.507 87.48 75.899 80 76 59.81 76 44 86.54 44 100c.013 2.95 .77 5.85 2.2 8.43l-32 16c-1.348 .679-2.199 2.06-2.2 3.57v64c-.001 1.516 .855 2.902 2.21 3.58l64 32c1.127 .564 2.453 .564 3.58 0l160-80c1.355-.678 2.211-2.064 2.21-3.58v-64c.001-1.516-.855-2.902-2.21-3.58ZM160 44c15.18 0 28 7.33 28 16 0 8.67-12.82 16-28 16C144.82 76 132 68.67 132 60c0-8.67 12.82-16 28-16ZM131.43 74.76C138 80.41 148.23 84 160 84c19 0 34.09-9.32 35.83-21.61L231.06 80 80 155.53 24.94 128 51.43 114.76C58 120.41 68.23 124 80 124c20.19 0 36-10.54 36-24 0-5.34-2.49-10.21-6.75-14.15ZM80 84c15.18 0 28 7.33 28 16 0 8.67-12.82 16-28 16-10.49 0-19.85-3.5-24.63-8.52-.09-.12-.19-.21-.28-.31C53.194 105.255 52.09 102.694 52 100 52 91.33 64.82 84 80 84ZM20 134.47l56 28v55.06l-56-28ZM84 217.53v-55.06l152-76v55.06Z"),
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
        return _lego!!
    }

private var _lego: ImageVector? = null
