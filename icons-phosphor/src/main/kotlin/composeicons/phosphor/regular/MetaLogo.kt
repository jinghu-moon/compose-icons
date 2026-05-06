package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.MetaLogo: ImageVector
    get() {
        if (_metaLogo != null) return _metaLogo!!
        _metaLogo = phosphorRegularIcon(
            name = "MetaLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 149.31c0 16.11-3.17 29.89-9.17 39.84-7.43 12.33-19 18.85-33.39 18.85-27.94 0-47.78-37-68.78-76.22C111.64 100 92.35 64 74 64 64.62 64 54.06 74 45.75 90.67 36.911 108.968 32.216 128.99 32 149.31c0 13.2 2.38 24.12 6.88 31.58C43.38 188.35 49.82 192 58.56 192c15.12 0 30.85-24.54 44.23-48.55 2.154-3.866 7.034-5.254 10.9-3.1 3.866 2.154 5.254 7.034 3.1 10.9C101.46 178.71 83.07 208 58.56 208c-14.41 0-26-6.52-33.39-18.85C19.17 179.15 16 165.42 16 149.31c.236-22.791 5.501-45.249 15.42-65.77C42.82 60.62 57.94 48 74 48c27.94 0 47.77 37 68.78 76.22C159.79 156 179.08 192 197.44 192c8.74 0 15.18-3.63 19.68-11.11 4.5-7.48 6.88-18.38 6.88-31.58-.213-20.319-4.904-40.341-13.74-58.64C202 74 191.39 64 182 64c-8.36 0-17.68 7.48-28.51 22.88-1.622 2.397-4.411 3.731-7.295 3.489-2.884-.242-5.412-2.022-6.612-4.655-1.2-2.633-.884-5.709 .826-8.044C149.41 64.93 163.41 48 182 48c16.05 0 31.17 12.62 42.57 35.54 9.922 20.52 15.191 42.978 15.43 65.77Z"),
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
        return _metaLogo!!
    }

private var _metaLogo: ImageVector? = null
