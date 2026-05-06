package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.WeiboLine: ImageVector
    get() {
        if (_weiboLine != null) return _weiboLine!!
        _weiboLine = remixIcon(
            name = "WeiboLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.194 14.197c0 3.361-4.529 6.423-9.925 6.423-4.95 0-9.268-2.432-9.268-6.087 0-1.946 1.18-4.087 3.239-6.088C7.073 5.7 10.469 4.413 12.099 5.998c.497 .483 .723 1.122 .718 1.858 1.976-.575 3.651-.404 4.483 .752 .449 .623 .533 1.38 .326 2.208 1.511 .611 2.568 1.769 2.568 3.382ZM15.755 12.128c-.386-.411-.4-.92-.198-1.411 .208-.508 .213-.812 .12-.94-.264-.367-1.533-.362-3.194 .312-.053 .022-.122 .048-.207 .074-.098 .029-.197 .052-.302 .066-.345 .045-.672 .001-.983-.266-.419-.359-.474-.855-.322-1.316 .214-.67 .179-1.076 .036-1.214-.186-.181-.777-.191-1.658 .142C7.978 7.98 6.749 8.799 5.633 9.881 3.926 11.54 3.001 13.218 3.001 14.534c0 2.242 3.276 4.087 7.268 4.087 4.42 0 7.925-2.37 7.925-4.423 0-.738-.636-1.339-1.673-1.653-.394-.113-.536-.171-.767-.417ZM22.809 10.51c-.139 .535-.684 .856-1.219 .717-.535-.139-.856-.684-.717-1.219 .085-.326 .128-.664 .128-1.008 0-2.209-1.791-4-4-4-.279 0-.553 .028-.82 .084-.541 .113-1.07-.235-1.183-.775-.113-.541 .235-1.07 .775-1.183C16.174 3.042 16.585 3 17.001 3c3.314 0 6 2.686 6 6 0 .514-.065 1.02-.192 1.51Z"),
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
        return _weiboLine!!
    }

private var _weiboLine: ImageVector? = null
