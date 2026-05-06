package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Virus: ImageVector
    get() {
        if (_virus != null) return _virus!!
        _virus = phosphorDuotoneIcon(
            name = "Virus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 40C79.399 40 40 79.399 40 128c0 48.601 39.399 88 88 88 48.601 0 88-39.399 88-88C216 79.399 176.601 40 128 40ZM108 128C96.954 128 88 119.046 88 108 88 96.954 96.954 88 108 88c11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20Z"),
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
                pathData = parseSvgPathData("M136 108C136 92.536 123.464 80 108 80 92.536 80 80 92.536 80 108c0 15.464 12.536 28 28 28 15.464 0 28-12.536 28-28ZM108 120c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM176 112c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16ZM144 176c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16ZM240 120h-16.34C222.013 100.12 214.184 81.254 201.27 66.05L213.66 53.66c3.126-3.126 3.126-8.194 0-11.32-3.126-3.126-8.194-3.126-11.32 0L190 54.73C174.782 41.807 155.898 33.977 136 32.34v-16.34c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v16.34C100.12 33.987 81.254 41.816 66.05 54.73L53.66 42.34c-3.126-3.126-8.194-3.126-11.32 0-3.126 3.126-3.126 8.194 0 11.32L54.73 66.05c-12.923 15.218-20.753 34.102-22.39 54h-16.34c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h16.34c1.647 19.88 9.476 38.746 22.39 53.95L42.34 202.34c-3.126 3.126-3.126 8.194 0 11.32 3.126 3.126 8.194 3.126 11.32 0L66.05 201.27c15.218 12.923 34.102 20.753 54 22.39v16.34c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16.34c19.88-1.647 38.746-9.476 53.95-22.39l12.39 12.39c3.126 3.126 8.194 3.126 11.32 0 3.126-3.126 3.126-8.194 0-11.32L201.27 190c12.923-15.218 20.753-34.102 22.39-54h16.34c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM128 208C83.817 208 48 172.183 48 128 48 83.817 83.817 48 128 48c44.183 0 80 35.817 80 80-.05 44.162-35.838 79.95-80 80Z"),
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
        return _virus!!
    }

private var _virus: ImageVector? = null
