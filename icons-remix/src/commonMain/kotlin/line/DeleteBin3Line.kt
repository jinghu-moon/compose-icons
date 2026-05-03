package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DeleteBin3Line: ImageVector
    get() {
        if (_deleteBin3Line != null) return _deleteBin3Line!!
        _deleteBin3Line = remixIcon(
            name = "DeleteBin3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.000 7.000 L 20.000 20.000 C 20.000 21.105 19.105 22.000 18.000 22.000 L 6.000 22.000 C 4.895 22.000 4.000 21.105 4.000 20.000 L 4.000 7.000 L 2.000 7.000 L 2.000 5.000 L 22.000 5.000 L 22.000 7.000 L 20.000 7.000 ZM 6.000 7.000 L 6.000 20.000 L 18.000 20.000 L 18.000 7.000 L 6.000 7.000 ZM 11.000 9.000 L 13.000 9.000 L 13.000 11.000 L 11.000 11.000 L 11.000 9.000 ZM 11.000 12.000 L 13.000 12.000 L 13.000 14.000 L 11.000 14.000 L 11.000 12.000 ZM 11.000 15.000 L 13.000 15.000 L 13.000 17.000 L 11.000 17.000 L 11.000 15.000 ZM 7.000 2.000 L 17.000 2.000 L 17.000 4.000 L 7.000 4.000 L 7.000 2.000 Z"),
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
        return _deleteBin3Line!!
    }

private var _deleteBin3Line: ImageVector? = null
