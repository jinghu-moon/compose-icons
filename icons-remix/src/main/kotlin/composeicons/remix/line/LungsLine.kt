package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.LungsLine: ImageVector
    get() {
        if (_lungsLine != null) return _lungsLine!!
        _lungsLine = remixIcon(
            name = "LungsLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22.001 17C22 21 22 21 18.001 21c-4 0-5-3-5-6 0-.378-.018-.918-.027-1.55l2.023 1.169 .004 .381c0 2.776 .816 4 3 4 1.14 0 1.611-.007 1.962-.038 .031-.352 .038-.822 .038-1.962 0-3.205-.703-6.033-1.835-7.901C17.328 7.718 16.553 7.258 16.134 7.397c-.293 .098-.605 .649-.831 1.623L13.512 7.987c.37-1.196 .982-2.151 1.989-2.487 2.999-1 6.502 4 6.5 11.5ZM8.5 5.5c1.007 .336 1.619 1.29 1.989 2.487L8.699 9.02C8.473 8.047 8.16 7.495 7.868 7.397 7.448 7.258 6.673 7.718 5.836 9.099 4.703 10.967 4 13.795 4 17c0 1.14 .007 1.611 .037 1.962C4.389 18.993 4.86 19 6 19c2.184 0 3-1.224 3-4l.004-.382 2.023-1.167C11.018 14.083 11 14.622 11 15c0 3-1 6-5 6C2 21 2 21 2 17 2 9.5 5.501 4.5 8.5 5.5ZM13 2l-0 7.422 4.696 2.712-1 1.732L12 11.155 7.304 13.866l-1-1.732L11 9.422 11 2h2Z"),
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
        return _lungsLine!!
    }

private var _lungsLine: ImageVector? = null
