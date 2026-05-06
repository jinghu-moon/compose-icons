package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.InfinityLine: ImageVector
    get() {
        if (_infinityLine != null) return _infinityLine!!
        _infinityLine = remixIcon(
            name = "InfinityLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 12C3 10.067 4.567 8.5 6.5 8.5c1.203 0 2.02 .434 2.699 1.113 .726 .726 1.286 1.719 1.927 2.872l.034 .061c.601 1.082 1.284 2.311 2.227 3.255 1.008 1.008 2.317 1.699 4.113 1.699C20.538 17.5 23 15.038 23 12 23 8.962 20.538 6.5 17.5 6.5c-1.661 0-3.149 .736-4.158 1.899 .446 .655 .815 1.306 1.122 1.858 .604-1.05 1.737-1.757 3.036-1.757C19.433 8.5 21 10.067 21 12c0 1.933-1.567 3.5-3.5 3.5-1.204 0-2.02-.434-2.699-1.113-.726-.726-1.286-1.719-1.927-2.872l-.034-.061C12.24 10.372 11.557 9.143 10.613 8.199 9.605 7.191 8.297 6.5 6.5 6.5 3.462 6.5 1 8.962 1 12c0 3.038 2.462 5.5 5.5 5.5 1.661 0 3.149-.736 4.158-1.899-.446-.655-.815-1.306-1.122-1.858-.604 1.05-1.737 1.757-3.036 1.757C4.567 15.5 3 13.933 3 12Z"),
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
        return _infinityLine!!
    }

private var _infinityLine: ImageVector? = null
