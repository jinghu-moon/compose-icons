package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CaretCircleDoubleRight: ImageVector
    get() {
        if (_caretCircleDoubleRight != null) return _caretCircleDoubleRight!!
        _caretCircleDoubleRight = phosphorDuotoneIcon(
            name = "CaretCircleDoubleRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M195.88 195.88c-27.455 27.457-68.747 35.672-104.621 20.813C55.386 201.834 31.995 166.829 31.995 128c0-38.829 23.39-73.834 59.264-88.693 35.874-14.859 77.165-6.644 104.621 20.813 37.487 37.49 37.487 98.27 0 135.76Z"),
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
                pathData = parseSvgPathData("M201.54 54.46C160.925 13.845 95.075 13.845 54.46 54.46c-40.615 40.615-40.615 106.465 0 147.08 40.615 40.615 106.465 40.615 147.08 0 40.615-40.615 40.615-106.465 0-147.08ZM190.23 190.23c-34.367 34.362-90.084 34.36-124.448-.006C31.418 155.858 31.418 100.142 65.782 65.776c34.364-34.366 90.08-34.369 124.448-.006 34.312 34.392 34.312 90.068 0 124.46ZM125.66 122.34c1.502 1.501 2.346 3.537 2.346 5.66 0 2.123-.844 4.159-2.346 5.66l-32 32c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32L108.69 128 82.34 101.66c-3.126-3.126-3.126-8.194 0-11.32 3.126-3.126 8.194-3.126 11.32 0ZM181.66 122.34c1.502 1.501 2.346 3.537 2.346 5.66 0 2.123-.844 4.159-2.346 5.66l-32 32c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32L164.69 128 138.34 101.66c-3.126-3.126-3.126-8.194 0-11.32 3.126-3.126 8.194-3.126 11.32 0Z"),
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
        return _caretCircleDoubleRight!!
    }

private var _caretCircleDoubleRight: ImageVector? = null
