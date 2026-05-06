package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Function: ImageVector
    get() {
        if (_function != null) return _function!!
        _function = tablerFilledIcon(
            name = "Function",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17.333 3C19.358 3 21 4.642 21 6.667v10.666C21 19.358 19.358 21 17.333 21h-10.666C4.642 21 3 19.358 3 17.333v-10.666C3 4.642 4.642 3 6.667 3ZM13.75 6c-1.224-.001-2.249 .927-2.37 2.145L11.095 11h-2.095l-.117 .007c-.525 .062-.911 .523-.88 1.052 .031 .528 .468 .941 .997 .941h1.894l-.265 2.656-.014 .071c-.048 .162-.196 .273-.365 .273C10.112 16 10 15.888 10 15.75v-.25l-.007-.117c-.062-.525-.523-.911-1.052-.88-.528 .031-.941 .468-.941 .997v.25l.005 .154c.081 1.18 1.062 2.096 2.245 2.096 1.224 .001 2.249-.927 2.37-2.145L12.904 13h2.096l.117-.007c.525-.062 .911-.523 .88-1.052C15.966 11.413 15.529 11.001 15 11h-1.895l.266-2.656 .014-.071c.048-.162 .196-.273 .365-.273 .138 0 .25 .112 .25 .25v.25l.007 .117c.062 .525 .523 .911 1.052 .88 .528-.031 .941-.468 .941-.997v-.25l-.005-.154C15.914 6.916 14.933 6 13.75 6Z"),
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
        return _function!!
    }

private var _function: ImageVector? = null
