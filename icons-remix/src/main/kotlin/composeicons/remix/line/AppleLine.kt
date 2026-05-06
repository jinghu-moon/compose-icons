package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.AppleLine: ImageVector
    get() {
        if (_appleLine != null) return _appleLine!!
        _appleLine = remixIcon(
            name = "AppleLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15.778 8.208c-.473-.037-.981 .076-1.758 .373 .065-.025-.742 .291-.969 .37-.502 .175-.915 .271-1.378 .271-.458 0-.881-.092-1.366-.255-.155-.052-.312-.11-.505-.186C9.72 8.749 9.42 8.629 9.354 8.604 8.706 8.35 8.342 8.254 8.039 8.262 6.886 8.276 5.796 8.942 5.162 10.044c-1.292 2.243-.577 6.299 1.312 9.031 1.006 1.444 1.556 1.96 1.777 1.953 .222-.01 .386-.057 .784-.225 .079-.034 .079-.034 .166-.071 1.006-.429 1.71-.618 2.771-.618 1.021 0 1.703 .186 2.668 .602 .089 .038 .089 .038 .168 .073 .398 .17 .541 .208 .792 .202 .358-.006 .799-.418 1.778-1.854 .268-.392 .505-.803 .71-1.219-.132-.109-.264-.225-.392-.347C16.409 16.341 15.611 14.684 15.59 12.639c-.014-1.62 .516-3.024 1.41-4.181-.37-.144-.777-.22-1.221-.25ZM15.933 6.214c.708 .048 2.736 .264 4.056 2.196-.108 .06-2.424 1.404-2.4 4.212 .036 3.36 2.94 4.476 2.976 4.488-.024 .084-.468 1.596-1.536 3.156-.924 1.356-1.884 2.7-3.396 2.724-1.488 .036-1.968-.876-3.66-.876-1.704 0-2.232 .852-3.636 .912C6.873 23.074 5.769 21.562 4.833 20.218 2.925 17.458 1.473 12.442 3.429 9.046 4.401 7.354 6.129 6.286 8.013 6.262c1.428-.036 2.784 .96 3.66 .96 .864 0 2.412-1.152 4.26-1.008ZM14.793 4.39c-.78 .936-2.052 1.668-3.288 1.572-.168-1.272 .456-2.604 1.176-3.432C13.485 1.594 14.829 .898 15.945 .85c.144 1.296-.372 2.604-1.152 3.54Z"),
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
        return _appleLine!!
    }

private var _appleLine: ImageVector? = null
