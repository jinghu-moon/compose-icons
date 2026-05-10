package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Bone: ImageVector
    get() {
        if (_bone != null) return _bone!!
        _bone = phosphorFillIcon(
            name = "Bone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M231.12 107.72c-11.621 13.332-31.22 16.217-46.19 6.8-.032-.012-.068-.012-.1 0l-70.35 70.36c0 0 0 0 0 .08 7.803 12.569 7.122 28.633-1.717 40.496-8.839 11.864-24.036 17.112-38.312 13.231C60.174 234.806 49.726 222.586 48.11 207.88 33.404 206.264 21.184 195.816 17.303 181.539c-3.881-14.276 1.367-29.473 13.231-38.312 11.864-8.839 27.927-9.52 40.496-1.717 .032 .012 .068 .012 .1 0L141.48 71.15c0 0 0 0 0-.08-7.803-12.569-7.122-28.633 1.717-40.496 8.839-11.864 24.036-17.112 38.312-13.231 14.276 3.881 24.725 16.101 26.341 30.807 13.385 1.409 24.866 10.167 29.764 22.703 4.897 12.537 2.392 26.758-6.494 36.867Z"),
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
        return _bone!!
    }

private var _bone: ImageVector? = null
