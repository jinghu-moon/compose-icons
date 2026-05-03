package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PaintingFill: ImageVector
    get() {
        if (_paintingFill != null) return _paintingFill!!
        _paintingFill = remixIcon(
            name = "PaintingFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.526 3.526 C 16.892 2.159 19.108 2.159 20.475 3.526 C 21.841 4.892 21.842 7.108 20.475 8.475 L 20.304 8.647 C 20.109 8.842 20.109 9.159 20.304 9.354 L 20.475 9.526 C 21.841 10.892 21.842 13.108 20.475 14.475 L 20.304 14.647 C 20.109 14.842 20.109 15.159 20.304 15.354 L 20.475 15.526 C 21.841 16.893 21.842 19.108 20.475 20.475 C 19.108 21.842 16.893 21.841 15.526 20.475 L 15.354 20.304 C 15.159 20.109 14.842 20.109 14.647 20.304 L 14.475 20.475 C 13.108 21.842 10.892 21.841 9.526 20.475 L 9.354 20.304 C 9.159 20.109 8.842 20.109 8.647 20.304 L 8.475 20.475 C 7.108 21.842 4.892 21.841 3.526 20.475 C 2.159 19.108 2.159 16.892 3.526 15.526 L 3.697 15.354 C 3.892 15.159 3.892 14.842 3.697 14.647 L 3.526 14.475 C 2.159 13.108 2.159 10.892 3.526 9.526 L 3.697 9.354 C 3.892 9.159 3.892 8.842 3.697 8.647 L 3.526 8.475 C 2.159 7.108 2.159 4.892 3.526 3.526 C 4.892 2.159 7.108 2.159 8.475 3.526 L 8.647 3.697 C 8.842 3.892 9.159 3.892 9.354 3.697 L 9.526 3.526 C 10.892 2.159 13.108 2.159 14.475 3.526 L 14.647 3.697 C 14.842 3.892 15.159 3.892 15.354 3.697 L 15.526 3.526 ZM 9.500 7.500 C 8.396 7.500 7.500 8.396 7.500 9.500 L 7.500 14.500 C 7.500 15.605 8.396 16.500 9.500 16.500 L 14.500 16.500 C 15.605 16.500 16.500 15.605 16.500 14.500 L 16.500 9.500 C 16.500 8.396 15.605 7.500 14.500 7.500 L 9.500 7.500 ZM 14.500 9.500 L 14.500 14.500 L 9.500 14.500 L 9.500 9.500 L 14.500 9.500 Z"),
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
        return _paintingFill!!
    }

private var _paintingFill: ImageVector? = null
