package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Moped: ImageVector
    get() {
        if (_moped != null) return _moped!!
        _moped = phosphorBoldIcon(
            name = "Moped",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212 124c-1.22 0-2.43 .06-3.62 .16L175.24 35.79C173.484 31.104 169.005 27.999 164 28h-32c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h23.68l30.23 80.6C179.217 137.538 174.049 144.261 171 152h-29.2L119.24 91.79C117.484 87.104 113.005 83.999 108 84h-80C21.373 84 16 89.373 16 96c0 6.627 5.373 12 12 12h4v2.92C12.335 121.331 .026 141.749 0 164c0 6.627 5.373 12 12 12h4.74c3.872 20.845 22.059 35.964 43.26 35.964 21.201 0 39.388-15.119 43.26-35.964h65.48c4.229 22.873 25.531 38.503 48.619 35.673 23.088-2.829 39.985-23.14 38.566-46.358C254.506 142.098 235.261 123.997 212 124ZM48 130.05c4.797-1.696 8.003-6.232 8-11.32v-10.73h43.68l16.5 44h-90.12C29.682 141.745 37.746 133.677 48 130.05ZM60 188c-7.949-.004-15.141-4.715-18.32-12h36.64C75.141 183.285 67.949 187.996 60 188ZM212 188c-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20Z"),
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
        return _moped!!
    }

private var _moped: ImageVector? = null
