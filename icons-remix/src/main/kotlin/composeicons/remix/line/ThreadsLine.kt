package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ThreadsLine: ImageVector
    get() {
        if (_threadsLine != null) return _threadsLine!!
        _threadsLine = remixIcon(
            name = "ThreadsLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.184 1.41h-.001C9.09 1.432 6.7 2.473 5.094 4.516 3.666 6.331 2.935 8.864 2.91 12.007v.001c.025 3.143 .756 5.661 2.184 7.476 1.607 2.042 4.009 3.084 7.101 3.106h.001c2.748-.019 4.697-.74 6.303-2.344 2.105-2.103 2.042-4.741 1.347-6.363-.529-1.234-1.575-2.221-2.976-2.835C16.689 8.063 15.01 6.322 12.25 6.304 10.619 6.294 9.148 7.024 8.247 8.391L9.902 9.527c.533-.809 1.377-1.199 2.335-1.19 1.387 .009 2.299 .774 2.555 2.117-.772-.121-1.602-.156-2.484-.105-2.639 .152-4.368 1.712-4.252 3.876 .121 2.262 2.312 3.494 4.392 3.381 2.492-.137 3.973-1.976 4.325-4.321 .577 .374 1.003 .851 1.244 1.413 .44 1.025 .468 2.716-.916 4.098-1.217 1.216-2.679 1.746-4.911 1.762C9.714 20.539 7.857 19.746 6.652 18.214 5.52 16.775 4.928 14.688 4.906 12 4.928 9.312 5.52 7.225 6.652 5.787 7.857 4.254 9.714 3.462 12.189 3.443c2.493 .019 4.384 .815 5.636 2.356 .691 .85 1.124 1.866 1.413 2.915l1.94-.518C20.815 6.859 20.241 5.584 19.363 4.503 17.71 2.469 15.282 1.432 12.184 1.41ZM12.42 12.378c.884-.051 1.704 .005 2.432 .156-.141 1.577-.793 2.946-2.512 3.04-1.112 .063-2.237-.434-2.292-1.461-.041-.764 .524-1.629 2.372-1.736Z"),
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
        return _threadsLine!!
    }

private var _threadsLine: ImageVector? = null
