package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Confetti: ImageVector
    get() {
        if (_confetti != null) return _confetti!!
        _confetti = tablerFilledIcon(
            name = "Confetti",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 5C3 4.448 3.448 4 4 4c.001-.529 .413-.966 .941-.997 .528-.031 .989 .355 1.052 .88L6 4c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052L6 6C6 6.552 5.552 7 5 7 4.448 7 4 6.552 4 6 3.448 6 3 5.552 3 5M10.53 3.757c.085-.349 .35-.625 .695-.725 .345-.099 .717-.006 .974 .244 .257 .25 .361 .619 .271 .967l-.5 2c-.085 .349-.35 .625-.695 .725-.345 .099-.717 .006-.974-.244-.257-.25-.361-.619-.271-.967ZM17 5c0-.552 .448-1 1-1 .001-.529 .413-.966 .941-.997 .528-.031 .989 .355 1.052 .88L20 4c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052L20 6c0 .552-.448 1-1 1C18.448 7 18 6.552 18 6 17.448 6 17 5.552 17 5M8.19 9.293l6.517 6.518c.232 .231 .336 .562 .278 .884-.058 .323-.27 .596-.568 .733L4.844 21.815c-.761 .355-1.663 .197-2.258-.396-.595-.593-.756-1.494-.403-2.256L6.573 9.583c.137-.298 .41-.509 .732-.567 .322-.058 .652 .046 .884 .277M15.706 8.293c.39 .391 .39 1.023 0 1.414l-1 1c-.392 .379-1.016 .374-1.402-.012-.386-.386-.391-1.009-.012-1.402l1-1c.391-.39 1.024-.39 1.414 0M19.756 11.53c.534-.13 1.073 .196 1.206 .729 .134 .533-.188 1.074-.72 1.211l-2 .5c-.534 .13-1.073-.196-1.206-.729-.134-.533 .188-1.074 .72-1.211ZM17 19c0-.552 .448-1 1-1 .001-.529 .413-.966 .941-.997 .528-.031 .989 .355 1.052 .88L20 18c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052L20 20c0 .552-.448 1-1 1-.552 0-1-.448-1-1-.552 0-1-.448-1-1"),
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
        return _confetti!!
    }

private var _confetti: ImageVector? = null
