package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ShipLine: ImageVector
    get() {
        if (_shipLine != null) return _shipLine!!
        _shipLine = remixIcon(
            name = "ShipLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 10.400 L 4.000 4.000 C 4.000 3.448 4.448 3.000 5.000 3.000 L 10.000 3.000 L 10.000 1.000 L 14.000 1.000 L 14.000 3.000 L 19.000 3.000 C 19.552 3.000 20.000 3.448 20.000 4.000 L 20.000 10.400 L 21.086 10.726 C 21.597 10.879 21.898 11.408 21.768 11.926 L 20.252 17.994 C 20.168 17.998 20.084 18.000 20.000 18.000 C 19.422 18.000 18.867 17.902 18.350 17.721 L 19.600 12.370 L 12.000 10.000 L 4.400 12.370 L 5.650 17.721 C 5.133 17.902 4.578 18.000 4.000 18.000 C 3.916 18.000 3.832 17.998 3.748 17.994 L 2.232 11.926 C 2.102 11.408 2.403 10.879 2.914 10.726 L 4.000 10.400 ZM 6.000 9.800 L 12.000 8.000 L 18.000 9.800 L 18.000 5.000 L 6.000 5.000 L 6.000 9.800 ZM 4.000 20.000 C 5.537 20.000 6.938 19.422 8.000 18.472 C 9.062 19.422 10.463 20.000 12.000 20.000 C 13.537 20.000 14.939 19.422 16.000 18.472 C 17.062 19.422 18.463 20.000 20.000 20.000 L 22.000 20.000 L 22.000 22.000 L 20.000 22.000 C 18.543 22.000 17.177 21.610 16.000 20.930 C 14.823 21.610 13.457 22.000 12.000 22.000 C 10.543 22.000 9.177 21.610 8.000 20.930 C 6.823 21.610 5.457 22.000 4.000 22.000 L 2.000 22.000 L 2.000 20.000 L 4.000 20.000 Z"),
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
        return _shipLine!!
    }

private var _shipLine: ImageVector? = null
