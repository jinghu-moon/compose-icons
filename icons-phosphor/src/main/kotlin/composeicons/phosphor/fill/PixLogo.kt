package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PixLogo: ImageVector
    get() {
        if (_pixLogo != null) return _pixLogo!!
        _pixLogo = phosphorFillIcon(
            name = "PixLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M235.34 139.28l-19.56 19.55c-.738 .738-1.736 1.158-2.78 1.17h-41.68l-32-32 32-32h41.68c1.058 .002 2.072 .422 2.82 1.17l19.56 19.55c6.193 6.252 6.175 16.33-.04 22.56ZM67.05 80h20.95c2.119 .001 4.151 .843 5.65 2.34L128 116.68 162.35 82.34C163.849 80.843 165.881 80.001 168 80h21c1.619 .001 3.079-.973 3.698-2.469 .62-1.496 .277-3.217-.868-4.361L139.33 20.66c-6.241-6.204-16.319-6.204-22.56 0L64.22 73.17c-1.145 1.144-1.488 2.866-.868 4.361 .62 1.496 2.08 2.47 3.698 2.469ZM189 176h-21c-2.119-.001-4.151-.843-5.65-2.34L128 139.31 93.65 173.66C92.151 175.157 90.119 175.999 88 176h-21c-1.619-.001-3.079 .973-3.698 2.469-.62 1.496-.277 3.217 .868 4.361l52.5 52.51c6.241 6.204 16.319 6.204 22.56 0l52.5-52.51c1.133-1.131 1.483-2.829 .889-4.316-.594-1.487-2.018-2.476-3.619-2.514ZM116.74 128l-32-32h-41.74c-1.058 .002-2.072 .422-2.82 1.17L20.66 116.72c-6.204 6.241-6.204 16.319 0 22.56l19.56 19.55c.738 .738 1.736 1.158 2.78 1.17h41.68Z"),
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
        return _pixLogo!!
    }

private var _pixLogo: ImageVector? = null
