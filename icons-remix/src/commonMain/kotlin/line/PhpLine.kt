package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PhpLine: ImageVector
    get() {
        if (_phpLine != null) return _phpLine!!
        _phpLine = remixIcon(
            name = "PhpLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.150 5.550 L 8.433 14.384 L 10.433 14.384 L 11.291 9.967 L 12.791 9.967 C 13.344 9.967 13.706 10.407 13.601 10.949 L 12.933 14.384 L 14.933 14.384 L 15.601 10.949 C 15.917 9.322 14.830 8.004 13.173 8.004 L 11.673 8.004 L 12.150 5.550 L 10.150 5.550 ZM 2.173 8.004 L 5.923 8.004 C 7.718 8.004 8.895 9.432 8.553 11.194 C 8.210 12.956 6.478 14.384 4.683 14.384 L 2.933 14.384 L 2.456 16.839 L 0.456 16.839 L 2.173 8.004 ZM 3.314 12.421 L 5.064 12.421 C 5.755 12.421 6.421 11.872 6.553 11.194 C 6.684 10.517 6.232 9.967 5.541 9.967 L 3.791 9.967 L 3.314 12.421 ZM 17.173 8.004 L 20.923 8.004 C 22.718 8.004 23.895 9.432 23.553 11.194 C 23.210 12.956 21.478 14.384 19.683 14.384 L 17.933 14.384 L 17.456 16.839 L 15.456 16.839 L 17.173 8.004 ZM 18.314 12.421 L 20.064 12.421 C 20.755 12.421 21.421 11.872 21.553 11.194 C 21.684 10.517 21.232 9.967 20.541 9.967 L 18.791 9.967 L 18.314 12.421 Z"),
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
        return _phpLine!!
    }

private var _phpLine: ImageVector? = null
