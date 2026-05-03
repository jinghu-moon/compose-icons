package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BaseStationLine: ImageVector
    get() {
        if (_baseStationLine != null) return _baseStationLine!!
        _baseStationLine = remixIcon(
            name = "BaseStationLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 13.000 L 18.000 22.000 L 6.000 22.000 L 12.000 13.000 ZM 12.000 16.600 L 9.740 20.000 L 14.260 20.000 L 12.000 16.600 ZM 10.939 10.561 C 10.354 9.975 10.354 9.025 10.939 8.439 C 11.525 7.854 12.475 7.854 13.061 8.439 C 13.646 9.025 13.646 9.975 13.061 10.561 C 12.475 11.146 11.525 11.146 10.939 10.561 ZM 5.282 2.782 L 6.697 4.197 C 3.768 7.126 3.768 11.874 6.697 14.803 L 5.282 16.218 C 1.572 12.507 1.572 6.492 5.282 2.782 ZM 18.718 2.782 C 22.427 6.492 22.427 12.507 18.718 16.218 L 17.303 14.803 C 20.232 11.874 20.232 7.126 17.303 4.197 L 18.718 2.782 ZM 8.111 5.611 L 9.525 7.025 C 8.158 8.392 8.158 10.608 9.525 11.975 L 8.111 13.389 C 5.963 11.241 5.963 7.759 8.111 5.611 L 8.111 5.611 ZM 15.889 5.611 C 18.037 7.759 18.037 11.241 15.889 13.389 L 14.475 11.975 C 15.842 10.608 15.842 8.392 14.475 7.025 L 15.889 5.611 Z"),
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
        return _baseStationLine!!
    }

private var _baseStationLine: ImageVector? = null
