package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FastForward: ImageVector
    get() {
        if (_fastForward != null) return _fastForward!!
        _fastForward = phosphorDuotoneIcon(
            name = "FastForward",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M144 128c.007 2.676-1.365 5.166-3.63 6.59L52.18 190.74c-2.424 1.555-5.502 1.669-8.034 .299C41.613 189.668 40.025 187.03 40 184.15v-112.3c.025-2.88 1.613-5.518 4.146-6.889 2.533-1.37 5.61-1.256 8.034 .299l88.19 56.15c2.265 1.424 3.637 3.914 3.63 6.59ZM244.37 121.41 156.18 65.26c-2.424-1.555-5.502-1.669-8.034-.299-2.533 1.37-4.121 4.009-4.146 6.889v112.3c.025 2.88 1.613 5.518 4.146 6.889 2.533 1.37 5.61 1.256 8.034-.299l88.19-56.15c2.258-1.43 3.627-3.917 3.627-6.59 0-2.673-1.369-5.16-3.627-6.59Z"),
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
                pathData = parseSvgPathData("M248.67 114.66 160.48 58.5c-4.888-3.125-11.089-3.342-16.183-.566-5.094 2.776-8.273 8.105-8.297 13.906v37.3L56.48 58.5C51.592 55.375 45.391 55.158 40.297 57.934 35.203 60.71 32.024 66.039 32 71.84v112.32c.03 5.798 3.21 11.122 8.302 13.896 5.092 2.775 11.289 2.561 16.178-.556L136 146.86v37.3c.03 5.798 3.21 11.122 8.302 13.896 5.092 2.775 11.289 2.561 16.178-.556l88.19-56.16c4.567-2.898 7.333-7.931 7.333-13.34 0-5.409-2.767-10.442-7.333-13.34ZM48 183.94v-111.87L135.82 128ZM152 183.94v-111.87L239.82 128Z"),
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
        return _fastForward!!
    }

private var _fastForward: ImageVector? = null
